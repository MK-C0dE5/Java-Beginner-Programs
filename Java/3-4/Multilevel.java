class Boy{
    String name;
    int age;
    void accept()
    {
        name = "mayur";
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
        roll = 21;
        marks = 100;
    }
    void putData()
    {
        System.out.println("Roll = "+roll);
        System.out.println("marks = "+marks);
    }
}
class Test extends Student
{
    int m1, m2;
    void get(int a, int b)
    {
        m1 = a;
        m2 = b;
    }
    void put()
    {
        System.out.println("m1 = "+m1);
        System.out.println("m2 = "+m2);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.accept();
        t1.display();
        t1.getData();
        t1.putData();
        t1.get(10,20);
        t1.put();
    }    
}
