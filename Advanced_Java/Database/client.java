import java.io.*;
class client{
    public static void main(String[] args) throws Exception{
        int choice = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        connection con = new connection();
        do{
            System.out.println("\n1. INSERT");
            System.out.println("2. DISPLAY ALL");
            System.out.println("3. SEARCH BY ID");
            System.out.println("4. SEARCH BY SCORE");   
            System.out.println("5. UPDATE THE TABLE");
            System.out.println("6. DELETE THE RECORD");
            System.out.println("7. Sort By id ");
            System.out.println("8. Sort By name ");
            System.out.println("9. Sort By score ");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    System.out.print("Enter how many criketer you want: ");
                    int n = Integer.parseInt(br.readLine());
 
                    for(int i=0;i<n;i++){
                        System.out.print("Enter Cricket id: ");
                        int id = Integer.parseInt(br.readLine());
                        System.out.print("Enter Cricket Name: ");
                        String name = br.readLine();
                        System.out.print("Enter Cricket Score: ");
                        int score = Integer.parseInt(br.readLine());
                        con.insert(id,name,score);
                    }
                break;
                case 0:
                    con.close();
                    System.out.println("Thanks");
                break;
                case 2:
                    con.display();
                break;
                case 3:
                    System.out.print("Enter the Criketer Code: ");
                    int id = Integer.parseInt(br.readLine());
                    con.search(id);
                break;
                case 4:
                    System.out.print("Enter the Criketer Score: ");
                    int score = Integer.parseInt(br.readLine());
                    con.score(score);
                break;
                case 5:
                    System.out.print("Enter New Cricket id: ");
                    id = Integer.parseInt(br.readLine());

                    System.out.print("Enter New Cricket Name: ");
                    String name = br.readLine();

                    System.out.print("Enter New Cricket Score: ");
                    score = Integer.parseInt(br.readLine());
                    con.update(id,name,score);
                break;
                case 6:
                    System.out.print("Enter New Cricket id: ");
                    id = Integer.parseInt(br.readLine());
                    con.delete(id);
                break;
                case 7:
                    con.sortbyid();
                break;
                case 8:
                    con.sortbyname();
                break;
                case 9:
                    con.sortbyscore();
                break;
            }
        }while(choice != 0);

    }
}