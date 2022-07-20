import java.sql.*;  
class ResultStateMetadataEg{  
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
public static void main(String args[]){  
try{  
System.out.println("Practical 7.1 - 194028");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","gourav","1234");

  
PreparedStatement ps=con.prepareStatement("select * from CRICKETER");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData ResultStateMetadataEg=rs.getMetaData();  
  
System.out.println("Total columns: "+ResultStateMetadataEg.getColumnCount());  
System.out.println("Column Name of 1st column: "+ResultStateMetadataEg.getColumnTypeName(1));  
System.out.println("Column Type Name of 2nd column: "+ResultStateMetadataEg.getColumnTypeName(2));  
System.out.println("Column Type Name of 3rd column: "+ResultStateMetadataEg.getColumnTypeName(3));  
  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  