package module14.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        if (employees == null) {
            return Optional.empty();
        }

        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        System.out.println("Завдання 1: Фільтрація продуктів");
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", "Phone", LocalDate.now().minusMonths(6), 4500));
        products.add(new Product("Samsung", "Phone", LocalDate.now().minusYears(2), 3200));
        products.add(new Product("Asus", "Laptop", LocalDate.now().minusMonths(10), 5000));
        products.add(new Product("Google", "Phone", LocalDate.now().minusYears(3), 2800));
        products.add(new Product("Xiaomi", "Phone", LocalDate.now().minusMonths(2), 3500));
        products.add(new Product("OnePlus", "Phone", LocalDate.now().minusYears(1).minusDays(1), 3800));

        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        List<Product> filteredAndSortedPhones = products.stream()
                .filter(p -> "Phone".equals(p.getCategory()))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Відфільтровані та відсортовані телефони:");
        filteredAndSortedPhones.forEach(System.out::println);

        System.out.println("\n Завдання 2: Найпопулярніше ім'я");
        List<Employee> employeeList = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> popularName = mostPopularName(employeeList.stream());
        popularName.ifPresent(name -> System.out.println("Найпопулярніше ім'я: " + name));

        Optional<String> emptyResult = mostPopularName(Stream.empty());
        System.out.println("Результат для порожнього потоку: " + emptyResult);
    }
}
