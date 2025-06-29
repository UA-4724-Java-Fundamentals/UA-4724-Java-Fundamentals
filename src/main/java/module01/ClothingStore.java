package module01;

public class ClothingStore {
    public static void main(String[] args) {
        String customerName = "Olena";
        int itemsBought = 2;
        double itemPrice = 750.50;
        String paymentMethod = "Cash";
        double totalCost = itemsBought * itemPrice;
        System.out.println("Welcome, " + customerName + ", thank you for your purchase! <3");
        System.out.println("Number ot items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + "UAH.");
        System.out.println("Total cost: " + totalCost + "UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}
