import java.util.*;
public class _8_phone_no {
    public static void main(String args[]) {
       HashMap<String, String> phone_book = new HashMap<>();
       System.out.print("Enter how many entries you want to do: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Enter the name and phone number for each entry:");
       for(int i=0;i<n;i++){
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter phone no: ");
            String phone_no = sc.nextLine();
            
            phone_book.put(phone_no, name.toLowerCase());
       }
       int c = 1;
       while(true){
            System.out.print("Enter phone no: ");
            String phone_no = sc.nextLine();
            if(phone_no.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            if(phone_book.containsKey(phone_no)){
                System.out.println("Name: "+phone_no+" Phone No: "+phone_book.get(phone_no));
            }
            else{
                System.out.println("Not found");
            }
            System.out.println("Enter the name to search for entries (type 'exit' to quit):");
       }
        
    }   
}
