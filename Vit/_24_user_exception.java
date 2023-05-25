import java.util.*;

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String Message){
        super(Message);
    }
}

class NameNotValidException extends Exception{
    public NameNotValidException(String Message){
        super(Message);
    }
}

class student{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }
        this.age = age;

        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }

        this.name = name;
        this.course = course;
    }
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }        

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

}
public class _24_user_exception {
    public static void main(String[] args) {
        try {
            student student1 = new student(1, "John", 19, "Science");
            System.out.println("Student 1 created: " + student1.getName() + " Roll no. "+ student1.getRollNo()+ " Age: "+student1.getAge());

            student student2 = new student(2, "Jane123", 20, "Math");
            System.out.println("Student 2 created: " + student2.getName() + " Roll no. "+ student2.getRollNo()+ " Age: "+student2.getAge());

            student student3 = new student(3, "Sam", 22, "English");
            System.out.println("Student 2 created: " + student3.getName() + " Roll no. "+ student3.getRollNo()+ " Age: "+student3.getAge());
        
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
