import java.sql.*;
class database{
	public static void main(String args[]){
		try{
			String dbUrl ="jdbc:mysql://localhost:3306/JAVA";
			String username ="root";
			String password = "khadde";

			Connection myConnection=DriverManager.getConnection(dbUrl,username,password);

			Statement myStatement=myConnection.createStatement();
			System.out.println("Select Query: ");
			ResultSet myResultSet1=myStatement.executeQuery("Select * from students");

			// System.out.println("Insert Query: ");
			// ResultSet myResultSet2=myStatement.executeQuery("INSERT INTO students VALUES(3,'Yash', 'Sonavane');");
			// ResultSet myResultSet3=myStatement.executeQuery("Select * from students");

			// System.out.println("Update Query: ");
			// ResultSet myResultSet4=myStatement.executeQuery("UPDATE students SET lastname='Giri' WHERE id=2;");
			// ResultSet myResultSet5=myStatement.executeQuery("Select * from students");

			// System.out.println("Delete Query: ");
			// ResultSet myResultSet6=myStatement.executeQuery("DELETE FROM students where id=3");
			// ResultSet myResultSet7=myStatement.executeQuery("Select * from students");


			while(myResultSet1.next()){
				System.out.println("Student Full name: "+myResultSet1.getString("firstname") +  " " + myResultSet1.getString("lastname"));
			}
			// while(myResultSet2.next()){
			// 	System.out.println("Student Full name: "+myResultSet.getString("firstname") +  " " + myResultSet.getString("lastname"));
			// }
			// while(myResultSet3.next()){
			// 	System.out.println("Student Full name: "+myResultSet.getString("firstname") +  " " + myResultSet.getString("lastname"));
			// }
			// while(myResultSet4.next()){
			// 	System.out.println("Student Full name: "+myResultSet.getString("firstname") +  " " + myResultSet.getString("lastname"));
			// }
			// while(myResultSet5.next()){
			// 	System.out.println("Student Full name: "+myResultSet.getString("firstname") +  " " + myResultSet.getString("lastname"));
			// }
			// while(myResultSet6.next()){
			// 	System.out.println("Student Full name: "+myResultSet.getString("firstname") +  " " + myResultSet.getString("lastname"));
			// }
			// while(myResultSet7.next()){
			// 	System.out.println("Student Full name: "+myResultSet.getString("firstname") +  " " + myResultSet.getString("lastname"));
			// }
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
