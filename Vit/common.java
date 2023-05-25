//Write a Java program to find the common elements between two arrays of integers.
import java.util.*;

public class common {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first list of array: ");
        String first = sc.nextLine();
        System.out.print("Enter the second list of array: ");
        String second = sc.nextLine();
        String[] first1 = first.split(" ");
        String[] second1 = second.split(" ");
        int[] array1 = new int[first1.length];
        int[] array2 = new int[second1.length];
        int i=0;
        for(i=0;i<first1.length;i++){
            array1[i] = Integer.parseInt(first1[i]);
        }
        for(i=0;i<second1.length;i++){
            array2[i] = Integer.parseInt(second1[i]);
        }
        System.out.print("Common Elements: ");
        for(i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.print(array1[i]+"\t");
                }
            }
        }

    }    
}
