public class multiple_catch {
    public static void main(String[] args) {
        try{
            int a = 3;
            System.out.println("a = "+a);
            int b = 42/a;
            int c[] = {1};
            c[20] = 99;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by 0: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index Out of bound: "+e);
        }
        System.out.println("After try/ catch block");
    }
}
