//Java Program to Count Number of Duplicate Words in String

import java.util.*;

public class duplicate_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String[] data = s.split(" ");
        HashMap<String, Integer> map1 = new HashMap<>();
        for(String words : data){
            map1.put(words, map1.getOrDefault(words, 0) + 1);
        }
        for(Map.Entry m : map1.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());  
        }
    }    
}
