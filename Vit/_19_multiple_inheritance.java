import java.util.*;
interface Account{
    void set(String name, double account_no, double balance);
    void display();
}
interface person{
    void store(String pname);
    void disp();
}

class customer implements Account, person{
    String name, pname;
    double account_no;
    double balance;

    public void set(String name, double account_no, double balance){
        this.name = name;
        this.account_no = account_no;
        this.balance = balance;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Account No: "+account_no);
        System.out.println("Balance: "+balance);
    }
    public void store(String pname){
        this.pname = pname;
    }
    public void disp(){
        System.out.println("Person Information:");
        System.out.println("PName: " + pname);
    }
    public void calculate(int rate){
        double intrest = balance*rate/100;
        System.out.println(rate+"% Intrest on "+balance+" is: "+intrest);
    }
}
public class _19_multiple_inheritance {
    public static void main(String[] args) {
        customer c = new customer();
        c.store("Knight");
        c.set("Knight's Acc", 123, 1000);
        c.disp();
        c.display();
        c.calculate(5);   
    }
}
