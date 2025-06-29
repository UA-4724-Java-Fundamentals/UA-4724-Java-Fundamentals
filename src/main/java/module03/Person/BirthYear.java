package module03.Person;

import java.time.Year;

public class BirthYear {

    public int age(int year) {
        int temp;
        int currentYear = Year.now().getValue();
        temp = currentYear - year;
        return temp;
    }

}
