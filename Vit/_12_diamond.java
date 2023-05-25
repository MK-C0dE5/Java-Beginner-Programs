import java.util.*;
public class _12_diamond {
    public static void main(String[] args) {
        System.out.print("Input number of rows (half of the diamond): ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=a-1; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
