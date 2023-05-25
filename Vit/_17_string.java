import java.util.*;
import java.lang.*;
public class _17_string {
    public static void main(String[] args) {
        System.out.println("Enter 10 words: ");
        Scanner sc = new Scanner(System.in);
        String[] word = new String[10];
        for(int i=0; i<10; i++){
            word[i] = sc.nextLine();
        }

        Arrays.sort(word);
        System.out.print("Sorted array: ");

        for(int i=0; i<10; i++){
            System.out.print(word[i]);
        }

        System.out.print("Combine two strings");
        String newString = combineStrings(word[0],word[1]);
        System.out.println(newString);

        System.out.print("Reverse first string");
        String reverse = reverseString(word[0]);
        System.out.println(reverse);
    }
    public static String combineStrings(String str1, String str2) {
        return str1 + str2;
    }
    public static String reverseString(String s1){
        StringBuilder s2 = new StringBuilder(s1);
        return s2.reverse().toString();
    }
}
