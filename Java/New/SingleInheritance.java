class Boy{
    String name;
    int age;
    Boy()
    {
        name = "Mayur";
        age = 18;
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
    Student()
    {
        roll = 20;
        marks = 100;
    }
    void putData()
    {
        System.out.println("Roll No: "+roll);
        System.out.println("Marks = "+marks);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        s1.putData();
    }
}
