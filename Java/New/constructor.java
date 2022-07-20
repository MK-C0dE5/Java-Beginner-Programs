class Student
{
    int roll,marks;
    Student()
    {
        roll = 10;
        marks = 15;
    }
    void putdata()
    {
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.putdata();
    }
}
