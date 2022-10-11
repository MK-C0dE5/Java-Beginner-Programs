class Boy
{
    String name;
    int age;
    void getData()
    {
        name = "Mayur";
        age = 21;
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}

class Student extends Boy
{
    int roll, marks;
    void getData()
    {
        super.getData();
        roll = 21;
        marks = 100;
    }
    void putData()
    {
        System.out.println("Roll No = "+roll);
        System.out.println("marks = "+marks);
    }
}

public class Superclass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData();
        s1.display();
        s1.putData();
    }    
}
