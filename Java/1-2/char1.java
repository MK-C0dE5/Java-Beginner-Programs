public class char1{
    public static void main(String[] args) {
        char c;
        c = "cwit".charAt(1);
        System.out.println(c);
        String b = "This is a demo of the getChars method.";
        int Start = 10;
        int end = 14;
        char buff[] = new char[end-Start];
        b.getChars(Start, end, buff, 0);
        System.out.println(buff);
    }   
}