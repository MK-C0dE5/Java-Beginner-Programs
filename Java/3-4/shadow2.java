public class shadow2 {
    String s = "main";
    public static void main(String s[]) {
        S2 s2 = new S2();
        s2.display(); // Produces an output - S1, S2
        S1 s1 = new S1();
        System.out.println(s1.getS()); // prints S1
        System.out.println(s2.getS()); // prints S1 - since super-class method
        // always accesses super-class variable
    }
}
    class S1 {
        String s = "S1";
        public String getS() {
            return s;
        }
        void display() {
            System.out.println(s);
        }
    }
    class S2 extends S1{
        String s = "S2";
        void display() {
            super.display(); // Prints S1
            System.out.println(s); // prints S2
        }
    }