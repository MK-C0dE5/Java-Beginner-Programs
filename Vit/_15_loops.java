import java.util.*;
public class _15_loops {
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(20);
        a1.add(30);
        a1.add(40);
        Iterator<Integer> i1 = a1.iterator();
        while(i1.hasNext()){
            int element = i1.next();
            System.out.println(element);
        }

        System.out.print("Advanced Loop: ");
        for(int element : a1){
            System.out.print(element + "\t");
        }

        System.out.print("For Loop: ");
        for(int i=0; i<a1.size();i++){
            int element = a1.get(i);
            System.out.print(element);
        }        

    }
}
