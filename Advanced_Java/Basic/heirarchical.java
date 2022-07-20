class employee
{
    String name;
    int age;
    void accept()
    {
        name = "mayur";
        age = 21;
    }
    void display()
    {
        System.out.println("\nName = "+name);
        System.out.println("Age = "+age);
    }
}
class manager extends employee
{
    int grade;
    String dept;
    void putData()
    {
        grade = 3;
        dept = "sales";
    }
    void getData()
    {
        System.out.println("Grade = "+grade);
        System.out.println("Dept = "+dept);
    }
}

class engineer extends employee
{
    String project;
    String teamid;
    void get() {
    project="ERP";
    teamid="E-7";
    }
    void put() {
    System.out.println("Project= "+ project);
    System.out.println("Teamid= "+ teamid);
    }
}
public class heirarchical {
    public static void main(String[] args) {
        manager m1 = new manager();
        m1.accept();
        m1.display();
        m1.putData();
        m1.getData();
        engineer e1 = new engineer();
        e1.accept();
        e1.display();
        e1.get();
        e1.put();
    }    
}
