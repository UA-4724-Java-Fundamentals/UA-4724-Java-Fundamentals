package module05;

import java.util.Arrays;
import java.util.Scanner;

public class PrTask01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = {"Bob","Alice","John"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {1.0,2.5,3.0,4,5};
        double sum = 0.0;
        for(double number : numbers){
            sum += number;
        }
        double average = sum/numbers.length;
        System.out.println("The avarage value is :" +  average);

        System.out.println("Enter the name to search: " );
        String nameToSearch = SCANNER.nextLine();
        boolean found = false;
        for(var name : names){
            if(name.equals(nameToSearch)){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("The name is found at :" +  nameToSearch + " is on the list");
        }else {
            System.out.println("The name is not found at :" +  nameToSearch+ " is not found");
        }


        System.out.println("Enter the name to search: " );
        nameToSearch = SCANNER.nextLine();
        int ix = Arrays.binarySearch(names, nameToSearch);
        if(ix>=0){
            System.out.println("The name is found at :" +  nameToSearch + " is on the list");
        }else {
            System.out.println("The name is not found at :" +  nameToSearch+ " is not found");
        }
    }
}
