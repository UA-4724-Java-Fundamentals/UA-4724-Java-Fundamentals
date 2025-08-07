
public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public String info() {
        return super.info() + String.format(", Course: %d", course);
    }


    @Override
    public String activity() {
        return "I study at university";
    }


    @Override
    public Student clone() {
        FullName orig = getFullName();
        FullName copy  = new FullName(orig.getFirstName(), orig.getLastName());
        return new Student(copy, getAge(), course);
    }
}
