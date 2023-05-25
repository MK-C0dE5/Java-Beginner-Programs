import java.util.*;
public class _11_Prime_multiplication {
    public static void multiplication(int a){
        for(int i=1;i<11;i++){
            System.out.println(a + " X " + i +" = " + a*i);
        }
    }
    public static boolean prime(int a){
        if(a <= 1){
            return false;
        }
        
        for(int i=2;i<a;i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int data = sc.nextInt();
        multiplication(data);
        if(prime(data)){
            System.out.println(data + " is a prime number");
        }
        else{
            System.out.println(data + " is not a prime number");
        }
    }
}
