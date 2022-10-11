class Boy
{
    String name;
    int age;
    int roll,marks;
    void accept()
    {
        name=" Ameya";
        age=21;
        roll=99;
        marks=81;
    }
}
interface Student
{
    int totmarks=200;
    void putData();
}
class Test extends Boy implements Student
{
    int m1,m2;
    void get(int a, int b)
    {
        m1=a;
        m2=b;
    }
    void display()
    {
        System.out.println(" m1= "+ m1);
        System.out.println(" m2= "+ m2);
        System.out.println(" Avg= "+ (m1+m2)*100/totmarks);
    }
    public void putData()
    {
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
        System.out.println(" Roll: " + roll);
        System.out.println(" Marks: " + marks);
    }
}
class interface2
{
public static void main(String args[])
    {
        Test T=new Test();
        T.accept();
        T.get(89,91);
        T.putData();
        T.display();
    }
}