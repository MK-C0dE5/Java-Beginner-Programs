import java.sql.*;  
class databasemetadata{  
    public static void main(String args[]){  
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            String dbUrl ="jdbc:mysql://localhost:3306/JAVA";
			String username ="root";
			String password = "khadde";
            Connection myConnection=DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Database Connected Successfully\n");
            
            DatabaseMetaData db = myConnection.getMetaData();
            System.out.println("Driver Name: "+db.getDriverName());  
            System.out.println("Driver Version: "+db.getDriverVersion());  
            System.out.println("UserName: "+db.getUserName());  
            System.out.println("Database Product Name: "+db.getDatabaseProductName());  
            System.out.println("Database Product Version: "+db.getDatabaseProductVersion());  
            
            myConnection.close();  
        }   
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }  
}  