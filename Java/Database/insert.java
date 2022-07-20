import java.sql.*;
import java.io.*;
class insert{
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
            
            System.out.print("Enter How much Entry you want to make: ");
            int a = Integer.parseInt(br.readLine());

            for(int i = 0; i < a; i++){ 
                int size = a.length;
                String a[] = new String[];
                System.out.println(size);
                for(int j = 1; j <= rsmd.getColumnCount(); j++){
                    System.out.print("Enter "+rsmd.getColumnName(j)+": ");
                    String a[j-1] = parseInt(br.readLine());
                    if(rsmd.getColumnTypeName(1) == "INT")
                    {
                        Int i = Integer.parseInt(a[0]);
                        ps = myConnection.prepareStatement("INSERT INTO students(rsmd.getColumnName(j)) VALUES(?);");
                        ps.setInt(1,i);
                        rs = ps.executeQuery();
                    }
                    if(rsmd.getColumnTypeName(j) == "INT"{
                        Int i = Integer.parseInt(a[j-1])
                        ps = myConnection.prepareStatement("UPDATE students SET rsmd.getColumnName(j) = ? WHERE id = ?");
                        ps.setInt(1,i);
                        ps.setInt(2,)
                        rs = ps.executeQuery();
                    }
                    else{
                        
                    }
                }
            myConnection.close();
        }
        catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
}