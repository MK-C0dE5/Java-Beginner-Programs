class OverloadDemo
{
    void test()
    {
        System.out.println("No parameters");
    }
    void test(int a)
    {
        System.out.println("a: "+a);
    }
    void test(int a, int b)
    {
        System.out.println("THe total of a and b is: "+ (a+b));
    }
    double test(double a)
    {
        System.out.println("Double a = " + a);
        return a*a;
    }
}
public class overload {
    public static void main(String[] args) {
        OverloadDemo Over = new OverloadDemo();
        double result;
        Over.test();
        Over.test(10);
        Over.test(10,20);
        result = Over.test(123.45);
        System.out.println("Result of Over.test(123.45): "+result);
    }   
}
