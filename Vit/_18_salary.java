import java.util.*;
class person{
    String name;
    int age;
    void acceptdata(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}
class employee extends person{
    String Designation;
    int Salary;

    public void acceptData() {
        super.acceptdata();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        Designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        Salary = scanner.nextInt();
    }

    void displaydata(){
        System.out.println("Name: ");
        System.out.println("Age: ");
        System.out.println("Designation: ");
        System.out.println("Salary: ");
    }

    public boolean hasSalaryGreaterThan5000() {
        return Salary > 5000;
    }

}
public class _18_salary {
    public static void main(String[] args) {
        employee[] e1 = new employee[5];
        for(int i=0; i<5; i++){
            e1[i] = new employee();
            e1[i].acceptData();
        }
        System.out.println("Names of employees with salary greater than 5000:");
        for(employee employees : e1){
            if(employees.hasSalaryGreaterThan5000()){
                System.out.println(employees.name);
            }
        }
    }
}
