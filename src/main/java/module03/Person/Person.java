package module03.Person;

public class Person {
    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String getFirstName(){
        return firstName;
    }

    private String getLastName(){
        return lastName;
    }


    private void setFirstName(){
        this.firstName = firstName;
    }

    private void setLastName() {
        this.lastName = lastName;
    }

    public String fullName () {
        String name = "Full name: " + firstName + " " + lastName;
        return name;
    }


}
