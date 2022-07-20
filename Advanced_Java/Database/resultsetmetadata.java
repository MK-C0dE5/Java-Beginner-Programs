import java.sql.*;
class resultsetmetadata{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            String dbUrl ="jdbc:mysql://localhost:3306/JAVA";
			String username ="root";
			String password = "khadde";
            Connection myConnection=DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Database Connected Successfully\n");

            PreparedStatement ps = myConnection.prepareStatement("Select * from students");
            ResultSet rs = ps.executeQuery(); 
            ResultSetMetaData rm = rs.getMetaData();

            System.out.println("Column Number: "+rm.getColumnCount());
            System.out.println("Column Name of 1st column: "+rm.getColumnTypeName(1));
            System.out.println("Column Name of 2nd column: "+rm.getColumnName(2));
            System.out.println("Column Name of 3nd column: "+rm.getColumnName(3));
        }
        catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
}