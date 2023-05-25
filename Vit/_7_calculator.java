import java.math.*;
import java.lang.*;
import java.util.*;


class MyCalculator{
    long power(int a, int b){
        try{
            if(a < 0 || b < 0){
                throw new Exception("n or p should not be negative");
            }
            else if(a==0 || b == 0){
                throw new Exception("n or p should not be zero");
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
            System.exit(0);
        }
        if(b == 0){
            return 1;
        }
        else{
            return a * power(a,b-1);
        }
    }
}

public class _7_calculator {
    public static void main(String[] args) {
        MyCalculator calculate = new MyCalculator();
        int n = 10;
        int p = 0;
        long ans = calculate.power(n,p);
        System.out.println("Ans is: "+ ans);
    }
}
