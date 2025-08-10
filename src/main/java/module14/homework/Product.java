package module14.homework;

import java.time.LocalDate;
import java.util.Comparator;

public class Product {
    private String manufacture;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacture, String category, LocalDate dateOfManufacture, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", date=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
