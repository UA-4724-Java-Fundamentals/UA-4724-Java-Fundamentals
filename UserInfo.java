import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, address;

        System.out.print("What is your name? ");
        name = scanner.nextLine();

        System.out.print("Where do you live, " + name + "? ");
        address = scanner.nextLine();

        System.out.println("Name: " + name + ", Address: " + address);
    }
}
