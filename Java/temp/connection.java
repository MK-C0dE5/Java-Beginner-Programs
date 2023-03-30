import java.sql.*;  
class connection{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("show databases");  
while(rs.next())  
System.out.println(rs.getString("Database"));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  