public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello world");
        System.out.println("buffer = "+s1);
        System.out.println("length = "+s1.length());
        System.out.println("Capacity = "+s1.capacity()+"\n");
        System.out.println("CharAt(1) before = "+ s1.charAt(1));
        s1.setCharAt(1, 'i');
        s1.setLength(5);
        System.out.println("CharAt(1) After = "+ s1.charAt(1));
        System.out.println(s1);

        String s2 = s1.append(" Nice to meet you ").append(s1.length()).append("!").toString();
        System.out.println(s2);


    }
}
