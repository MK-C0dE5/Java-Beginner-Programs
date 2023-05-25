import java.util.*;
public class _3_reverse_palindrome {
    public static String revstring(String s) {
        char[] c = s.toCharArray();
        int length = c.length;
        char[] ans = new char[c.length];
        for(char arr : c){
            ans[--length] = arr;
        }
        String newString = new String(ans);
        return newString;
    }

    public static boolean palindrom(String s){
        int right = s.length()-1;
        int left = 0;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Reverse of the string: " + revstring(s));
        if(palindrom(s)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String not a is palindrome");
        }
    }
}
