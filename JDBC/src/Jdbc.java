/**
 * @author Kireet Joshi
  Connecting to database using CRUD operations
 */

import java.sql.*;
public class Jdbc
{
	public static void main(String[] args) {

		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kireet","root","root");
			System.out.println("connection established successfully");	
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from demo");
			System.out.println("-------------");
			System.out.println("name\tage");
			System.out.println("-------------");
			while(rs.next())
			{
				System.out.println(rs.getString("name")+"\t"+ rs.getInt("age"));
			}
			System.out.println("-------------");

			// after insert
			int i= st.executeUpdate("insert into demo values('Amit',19)"); 
			System.out.println(i+ " records added successfully");

			System.out.println("\n--- Records After Insert ---");
            rs = st.executeQuery("select * from demo");

            System.out.println("NAME\tAGE");
            System.out.println("----------------");
           
            while(rs.next())
            {
                System.out.println(rs.getString("name") + "\t" + rs.getInt("age"));
            }
            
            int x= st.executeUpdate("delete from demo where name='Amit'");
            System.out.println(x+ " rows deteted");
            System.out.println("\n--- Records After deletion ---");
            rs = st.executeQuery("select * from demo");

            System.out.println("NAME\tAGE");
            System.out.println("----------------");
            while(rs.next())
            {
                System.out.println(rs.getString("name") + "\t" + rs.getInt("age"));
            }
            
		}
		catch(Exception e)
		{
			System.out.println("unable to load the driver");	

		}
	}
}
