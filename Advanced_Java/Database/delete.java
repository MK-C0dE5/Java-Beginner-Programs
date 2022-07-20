import java.sql.*;
import java.io.*;
class delete{
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

            ps = myConnection.prepareStatement("SELECT * FROM students;");
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
            }

            System.out.print("Enter Student id you want to delete: ");
            int b = Integer.parseInt(br.readLine());
            ps = myConnection.prepareStatement("delete from students where id=?;");
            ps.setInt(1,b);
            ps.executeUpdate();
            System.out.println("Record deleted Successfully");
        }
        catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
}