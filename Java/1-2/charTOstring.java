import java.lang.*;
public class charTOstring {
    public static void main(String[] args) {
        String s = "mayur";
        String a = new String(s);
        System.out.println(a);
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String c = new String(chars,2,2);
        System.out.println(c);
    }
    
}
