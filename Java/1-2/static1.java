import java.util.*;
class Demo
{
    static int a = 10;
    static int b = 20;
    void read(int a3, int a4)
    {
        a = a3;
        b = a4;
    }
    static void callme()
    {
        System.out.println("a+b = "+ (a+b));
    }
}

public class static1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int a2 = sc.nextInt();
        Demo d1 = new Demo();
        d1.read(a1,a2);
        d1.callme();
    }
}
