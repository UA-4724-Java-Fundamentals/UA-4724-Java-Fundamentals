package module03;



public class Main {

   public static void main(String[] args) {
//
//    Student student = new Student();
//    student.setName("Alice");
//
    Student student2 = new Student("Bob",17);

        System.out.println("My name this long: " + student2.getName());
        System.out.println("My age this long: " + student2.getAge());
        System.out.println("My isYoung: " + student2.isYoung());

        StaticExample staticExample = new StaticExample();
        StaticExample staticExample1 = new StaticExample();
        StaticExample staticExample2 = new StaticExample();
        System.out.println("END");

    }

}

class StaticExample {
    {
        System.out.println("STATIC EXAMPLE");
    }


    static {
        System.out.println("name = " + StaticExample.name);
    }
    static String name = "MyName";
}
/**
 * This  class det
 */



class Student{
   private String name = "N/A ";
   private int age;
 //  private boolean isYoung = false;

    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isYoung() {
        return age <= 18;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name == null || name.length() == 0){
            throw new IllegalArgumentException("Name cannot be null or empty ") ;
        }
        this.name = name;
    }
}