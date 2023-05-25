import java.util.*;

public class _16_repeating {
    public static void main(String[] args) {
        Map<String, Integer> word = new HashMap<>();
        String para = "A matrix is a rectangular array of numbers or functions arranged in a fixed number of rows and columns. There are many types of matrices.Let us consider a matrix to understand more about them.";
        String[] separate = para.split(" ");
        for(String words : separate){
            word.put(words, word.getOrDefault(words, 0)+1);
        }
        System.out.println(word);
        for(Map.Entry m: word.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
