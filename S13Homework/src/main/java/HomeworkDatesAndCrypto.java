import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class HomeworkDatesAndCrypto {

    public static String encrypt(String s, int n) {
        if (s == null) return null;
        int k = Math.floorMod(n, 26);
        StringBuilder sb = new StringBuilder(s.length());
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int base = 'a';
                sb.append((char)(base + (ch - base + k) % 26));
            } else if (ch >= 'A' && ch <= 'Z') {
                int base = 'A';
                sb.append((char)(base + (ch - base + k) % 26));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    // Валідація "dd.MM.yy"
    public static boolean isValidDate_dd_MM_yy(String input) {
        if (input == null || !input.matches("\\d{2}\\.\\d{2}\\.\\d{2}")) return false;
        int dd = Integer.parseInt(input.substring(0, 2));
        int mm = Integer.parseInt(input.substring(3, 5));
        int yy = Integer.parseInt(input.substring(6, 8));
        int year = 2000 + yy;
        try {
            YearMonth ym = YearMonth.of(year, mm);
            LocalDate.of(year, mm, dd);
            return dd >= 1 && dd <= ym.lengthOfMonth();
        } catch (DateTimeException e) {
            return false;
        }
    }

    public static boolean isLeap(int year) {
        return Year.isLeap(year);
    }

    public static void printWeekdays(LocalDate date) {
        LocalDate plus6 = date.plusMonths(6);
        LocalDate plus12 = date.plusMonths(12);
        System.out.println("Date:      " + date + " -> " + date.getDayOfWeek());
        System.out.println("+6 months: " + plus6 + " -> " + plus6.getDayOfWeek());
        System.out.println("+12 months:" + plus12 + " -> " + plus12.getDayOfWeek());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to encrypt: ");
        String plain = sc.nextLine();
        System.out.print("Shift n: ");
        int n = Integer.parseInt(sc.nextLine());
        String enc = encrypt(plain, n);
        String dec = decrypt(enc, n);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);

        System.out.print("\nEnter date in dd.MM.yy to validate: ");
        String dateStr = sc.nextLine();
        System.out.println("Valid? " + isValidDate_dd_MM_yy(dateStr));

        System.out.print("\nEnter year to check leap: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Leap year? " + isLeap(year));

        System.out.print("\nEnter your birthday (yyyy-MM-dd): ");
        String b = sc.nextLine().trim();
        LocalDate birthday;
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("uuuu-MM-dd")
                    .withResolverStyle(ResolverStyle.STRICT);
            birthday = LocalDate.parse(b, fmt);
        } catch (Exception e) {
            System.out.println("Invalid format, using sample date 2000-01-01.");
            birthday = LocalDate.of(2000, 1, 1);
        }
        printWeekdays(birthday);
    }
}
