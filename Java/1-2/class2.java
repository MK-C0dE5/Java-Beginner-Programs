class Student
{
    String name;
    int id;

    void getinfo(int n, String name1)
    {
        name = name1;
        id = n;
    }
    void putdata()
    {
        System.out.println("Student name is: "+ name);
        System.out.println("Student Roll No is: "+ id);
    }
}
public class class2 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.getinfo(10, "Mayur");
        S1.putdata();
    }
}
