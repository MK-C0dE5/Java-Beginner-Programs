public class OpString {
    public static void main(String[] args) {
        String s1 = "This is a demo of the getChars method.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;
        do{
            System.out.println(s1);
            i = s1.indexOf(search);
            if(i != -1)
            {
                result = s1.substring(0, i);
                result = result + sub;
                result = result + s1.substring(i + search.length());
                s1 = result;
            }
        }
        while(i != -1);
        //Concat 

        String s2 = search.concat(" a");
        System.out.println(s2);
        String s4 = s1.trim();
        System.out.println(s4);
        String s3 = s1.replace('o','v');
        System.out.println(s3);
        
        //Uppercase
        System.out.println("Uppercase: "+s1.toUpperCase());
        System.out.println("Lowercase: "+s1.toLowerCase());
    }
}
