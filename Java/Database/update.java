import java.sql.*;
import java.io.*;
class update{
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

            System.out.print("Enter Student id: ");
            int b = Integer.parseInt(br.readLine());
            System.out.print("Enter FirstName: ");
            String c = br.readLine();
            System.out.print("Enter LastName: ");
            String d = br.readLine();
            ps = myConnection.prepareStatement("Update students set firstname=?, lastname=? where id=?;");
            ps.setString(1,c);
            ps.setString(2,d);
            ps.setInt(3,b);
            ps.executeUpdate();
            System.out.println("Record Updated Successfully");
        }
        catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
}
