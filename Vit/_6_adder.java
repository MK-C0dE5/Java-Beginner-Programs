
class Arithmetic{
    int add(int a, int b){
        return a+b;
    }
}

class adder extends Arithmetic{
}
public class _6_adder {
    public static void main(String[] args) {
        adder add = new adder();
        System.out.println("My SuperClass is: "+add.getClass().getSuperclass().getName());
        int a = 10;
        int b = 20;
        int sum = add.add(a,b);
        System.out.println("Sum is: "+sum);
    }    
}
