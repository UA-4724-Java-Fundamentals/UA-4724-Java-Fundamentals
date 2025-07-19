package module04;
import java.util.Scanner;

//import static module04.HTTPError.getHTTPError;


public class Homework03 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("ENTER HTTP ERROR CODE: ");
        String errorCode = SCANNER.nextLine(); // Змінимо ім'я для ясності

        try {
            HTTPError foundError = HTTPError.getHTTPError(errorCode);
            System.out.println("Error name is: " + foundError);
      } catch (IllegalArgumentException e) {
            System.out.println("Error: Unknown HTTP error code.");
        }
        SCANNER.close();
    }

}

enum HTTPError{
    BAD_REQUEST,UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND;



    public static HTTPError getHTTPError (String error){
        return switch ( error ) {
            case "400" -> BAD_REQUEST;
            case "401" -> UNAUTHORIZED;
            case "402" -> PAYMENT_REQUIRED;
            case "403" -> FORBIDDEN;
            case "404" -> NOT_FOUND;
            default -> throw new IllegalArgumentException(" Unknown error");

        };

    }
}

