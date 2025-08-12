import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    String manufactureCategory;
    LocalDate dateOfManufacture;
    double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String toString() {
        return manufactureCategory + " | " + dateOfManufacture + " | " + price;
    }
}

class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.now().minusYears(2), 4000),
                new Product("Phone", LocalDate.now().minusYears(3), 3500),
                new Product("Phone", LocalDate.now().minusMonths(6), 5000),
                new Product("Laptop", LocalDate.now().minusYears(2), 8000),
                new Product("Phone", LocalDate.now().minusYears(5), 4500),
                new Product("Phone", LocalDate.now().minusYears(2), 3200),
                new Product("Tablet", LocalDate.now().minusYears(1), 2500),
                new Product("Phone", LocalDate.now().minusYears(1).minusDays(1), 3100),
                new Product("Phone", LocalDate.now().minusYears(4), 6000),
                new Product("Laptop", LocalDate.now().minusYears(1), 7000),
                new Product("Phone", LocalDate.now().minusYears(2), 3050),
                new Product("Phone", LocalDate.now().minusYears(2), 4000),
                new Product("Tablet", LocalDate.now().minusYears(3), 2000),
                new Product("Phone", LocalDate.now().minusYears(3), 5000),
                new Product("Phone", LocalDate.now().minusYears(2), 3300),
                new Product("Laptop", LocalDate.now().minusYears(4), 9000),
                new Product("Phone", LocalDate.now().minusYears(5), 3400),
                new Product("Phone", LocalDate.now().minusYears(6), 4500),
                new Product("Phone", LocalDate.now().minusYears(2), 3600),
                new Product("Tablet", LocalDate.now().minusYears(2), 1500)
        );

        List<Product> result = products.stream()
                .filter(p -> p.manufactureCategory.equals("Phone"))
                .filter(p -> p.price > 3000)
                .filter(p -> p.dateOfManufacture.isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(p -> p.price))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        System.out.println(mostPopularName(employees.stream()).orElse("No name"));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(e -> e.name, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
