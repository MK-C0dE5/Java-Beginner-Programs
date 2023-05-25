import java.util.*;

class Person{
    String firstname;
    String lastname;

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    String getFirstName(){
        return firstname;
    }

    String getLastName(){
        return lastname;
    }
}
class employee extends Person{
    int emp_id;
    String job_title;

    public employee(String firstname, String lastname, int emp_id, String job_title){
        super(firstname, lastname);
        this.emp_id = emp_id;
        this.job_title = job_title;
    }

    int getEmployeeId(){
        return emp_id;
    }

    @Override
    String getLastName(){
        String new1 = super.lastname + "(" + job_title + ")";
        return new1;
    }
}
public class _22_employee_inheritance {
    public static void main(String[] args) {
        employee e1 = new employee("mayur", "khadde", 10, "Programmer");
        System.out.println("First Name: " + e1.getFirstName());
        System.out.println("Last Name: " + e1.getLastName());
        System.out.println("Employee ID: " + e1.getEmployeeId());
    }
}
