package module01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FlowerBedCalculator {
    public static void main(String[] args) {
     int radius = 10;
     double perimeter = 2*Math.PI*radius;
     double area = Math.PI*radius*radius;
        System.out.println("Периметр = " + perimeter + "; "+ "Площа = " + area + ";");
    }
}