import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        String name, address;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name?");
        name = input.nextLine();
        System.out.print("Where do you live," + name + "?");
        address = input.nextLine();
        System.out.println("Name: " + name + " Address: " + address);
    }
}
