import java.sql.*;
class interface1{
    public static void main(String args[]){  
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            String dbUrl ="jdbc:mysql://localhost:3306/JAVA";
			String username ="root";
			String password = "khadde";

            Connection myConnection=DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Database Connected Successfully\n");

            Statement st = myConnection.createStatement();
            PreparedStatement ps = myConnection.prepareStatement("Select * from students");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                System.out.println("ID: "+id);
                System.out.println("Firstname: "+firstName);
                System.out.println("Lastname: "+lastName);
            }
        }
        catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
}