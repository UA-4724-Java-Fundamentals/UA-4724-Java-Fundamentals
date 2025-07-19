package module04;
import java.util.Scanner;

public class Homework01 {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double num1,num2,num3;
        boolean count1 , count2, count3;

        System.out.println("Введіть 3 числа діапазон від -5 до 5 включно\n");
        num1 = SCANNER.nextDouble();
        num2 = SCANNER.nextDouble();
        num3 = SCANNER.nextDouble();

        if ((num1 >= -5 && num1 <= 5) &&
                (num2 >= -5 && num2 <= 5) &&
                (num3 >= -5 && num3 <= 5)) {
            System.out.println("Так, всі числа належать до діапазону [-5, 5].");

        }else {
            System.out.println(" одне або більше чисел поза діапазоном [-5 , 5].");
        }
        SCANNER.close();
    }


}
