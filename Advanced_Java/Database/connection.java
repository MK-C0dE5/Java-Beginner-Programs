import java.sql.*;
class connection{
    Connection myConnection;
    PreparedStatement ps;
    ResultSet rs;
    connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl ="jdbc:mysql://localhost:3306/JAVA";
			String username ="root";
			String password = "khadde";
            myConnection=DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Database Connected Successfully\n");
        }
        
        catch(Exception e){
            System.out.println("Not Connected: "+ e.getMessage());
        }
    }
    public void insert(int id, String name, int score) throws Exception{
        ps = myConnection.prepareStatement("INSERT INTO Criket(id,name,score) VALUES(?,?,?);");
        ps.setInt(1,id); 
        ps.setString(2,name);
        ps.setInt(3,score);
        ps.executeUpdate();
    }
    public void close() throws Exception{
        myConnection.close();
        System.out.println("Connection Closed");
    }
    public void display() throws Exception{
        ps = myConnection.prepareStatement("SELECT * FROM Criket");
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
        }
    }
    public void search(int id) throws Exception{
        ps = myConnection.prepareStatement("SELECT * FROM Criket WHERE id = ?");
        ps.setInt(1,id);
        rs = ps.executeQuery();
        if(rs.next())
            System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
        else
            System.out.println("Record Not Found");
    }
    public void score(int score) throws Exception{
        boolean found = false;
        ps = myConnection.prepareStatement("SELECT * FROM Criket WHERE score >= ?");
        ps.setInt(1,score);
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
            found=true;
        }
        if(!found)
            System.out.println("Record Not Found\n");
    }
    public void update(int id, String name, int score) throws Exception{
        ps = myConnection.prepareStatement("UPDATE Criket SET name = ?, score = ? WHERE id = ?");
        ps.setString(1,name);
        ps.setInt(2,score);
        ps.setInt(3,id);
        ps.executeUpdate();
        System.out.println("Done");
    }
    public void delete(int id) throws Exception{
        ps = myConnection.prepareStatement("SELECT * FROM Criket WHERE id = ?");
        ps.setInt(1,id);
        rs = ps.executeQuery();
        if(rs.next()){
            ps = myConnection.prepareStatement("DELETE FROM Criket WHERE id = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
        }
        else{
            System.out.println("Record Not Found");
        }
    }
    public void sortbyid() throws Exception{
        ps = myConnection.prepareStatement("SELECT * FROM Criket ORDER BY id ASC");
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
        }
    }
    public void sortbyscore() throws Exception{
        ps = myConnection.prepareStatement("SELECT * FROM Criket ORDER BY score ASC");
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
        }
    }
    public void sortbyname() throws Exception{
        ps = myConnection.prepareStatement("SELECT * FROM Criket ORDER BY name ASC");
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
        }
    }

}

