/**
 * MENU DRIVEN CRUD OPERATIONS USING STATEMENT INTERFACE
 *
 * @author {Kireet Joshi}
 */
import java.sql.*;
import java.util.*;

public class Jdbc1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kireet","root","root");

            System.out.println("Connection established successfully");

            Statement st = con.createStatement();

            while(true)
            {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.print("Enter your choice: ");

                int ch = Integer.parseInt(sc.nextLine());

                switch(ch)
                {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        int i = st.executeUpdate(
                            "insert into demo values('" + name + "'," + age + ")");
                        System.out.println(i + " record inserted");
                        break;

                    case 2:
                        ResultSet rs = st.executeQuery("select * from demo");

                        System.out.println("\nNAME\tAGE");
                        System.out.println("----------------");
                        while(rs.next())
                        {
                            System.out.println(
                                rs.getString("name") + "\t" + rs.getInt("age"));
                        }
                        break;

                    case 3:
                        System.out.print("Enter name to update: ");
                        String oldName = sc.nextLine();

                        System.out.print("Enter new age: ");
                        int newAge = Integer.parseInt(sc.nextLine());

                        int u = st.executeUpdate(
                            "update demo set age=" + newAge +
                            " where name='" + oldName + "'");
                        System.out.println(u + " record updated");
                        break;

                    case 4:
                        System.out.print("Enter name to delete: ");
                        String delName = sc.nextLine();

                        int d = st.executeUpdate(
                            "delete from demo where name='" + delName + "'");
                        System.out.println(d + " record deleted");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

                
                System.out.print("\nDo you wish to continue? (y/n): ");
                char choice = sc.nextLine().toLowerCase().charAt(0);

                if(choice == 'n')
                {
                    break;
                }
            }

            con.close();
            System.out.println("Program Ended");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}