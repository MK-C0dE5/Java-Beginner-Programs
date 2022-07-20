import java.sql.*;
import java.io.*;
class insert2{
    public static void main(String args[]){  
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            String dbUrl ="jdbc:mysql://localhost:3306/JAVA";
			String username ="root";
			String password = "khadde";
            Connection myConnection = DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Database Connected Successfully\n");

            Statement st = myConnection.createStatement();
            PreparedStatement ps = myConnection.prepareStatement("Select * from students");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.print("Enter how much Student info you want: ");
            int a = Integer.parseInt(br.readLine());
            for (int i = 0; i <a; i++ ){
                System.out.print("Enter id: ");
                int b = Integer.parseInt(br.readLine());
                System.out.print("Enter FirstName: ");
                String c = br.readLine();
                System.out.print("Enter LastName: ");
                String d = br.readLine();
                ps = myConnection.prepareStatement("Insert into students(id,firstname,lastname) values(?,?,?);");
                ps.setInt(1,b);
                ps.setString(2,c);
                ps.setString(3,d);
                ps.executeUpdate();
                System.out.println("Record Successfully Added");
            }
        }
        catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
}