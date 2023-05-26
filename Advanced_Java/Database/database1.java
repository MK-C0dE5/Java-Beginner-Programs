import java.sql.*;
class database1{
	public static void main(String args[]){
		try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
			String dbUrl ="jdbc:mysql://localhost:3306/apsystem";
			String username ="root";
			String password = "";
            System.out.println("Database Connected Successfully\n");

			Connection myConnection=DriverManager.getConnection(dbUrl,username,password);

			Statement myStatement=myConnection.createStatement();
			ResultSet myResultSet=myStatement.executeQuery("SHOW DATABASES;");
            System.out.println("Databases:");
			while(myResultSet.next()){
                System.out.println(myResultSet.getString("Database"));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
