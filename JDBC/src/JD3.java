/**
 * MENU DRIVEN CRUD OPERATIONS USING PREPAREDSTATEMENT
 * TABLE: data(name VARCHAR, id INT)
 * @author Kireet
 */
import java.sql.*;
import java.util.*;

public class JD3 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Kireet", "root", "root");
            System.out.println("Connection established successfully");

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1: // INSERT
                        System.out.print("Enter name: ");
                        String name1 = sc.next();

                        System.out.print("Enter id: ");
                        int id1 = sc.nextInt();

                        PreparedStatement ps1 = conn.prepareStatement(
                            "insert into data values(?,?)");

                        ps1.setString(1, name1); // name first
                        ps1.setInt(2, id1);      // id second

                        int i = ps1.executeUpdate();
                        System.out.println(i + " Record Inserted");
                        break;

                    case 2: // DISPLAY
                        System.out.println("Displaying data...");
                        break;

                    case 3: // UPDATE
                        System.out.print("Enter id to update: ");
                        int id2 = sc.nextInt();

                        System.out.print("Enter new name: ");
                        String name2 = sc.next();

                        PreparedStatement ps2 = conn.prepareStatement(
                            "update data set name=? where id=?");

                        ps2.setString(1, name2);
                        ps2.setInt(2, id2);

                        int y = ps2.executeUpdate();
                        System.out.println(y + " Record Updated");
                        break;

                    case 4: // DELETE
                        System.out.print("Enter id to delete: ");
                        int id3 = sc.nextInt();

                        PreparedStatement ps3 = conn.prepareStatement(
                            "delete from data where id=?");

                        ps3.setInt(1, id3);

                        int d = ps3.executeUpdate();
                        System.out.println(d + " Record Deleted");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

                // DISPLAY AFTER EVERY OPERATION
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from data");

                System.out.println("\nNAME\tID");
                while (rs.next()) {
                    System.out.println(
                        rs.getString("name") + "\t" + rs.getInt("id"));
                }

                // CONTINUE OPTION
                System.out.print("\nDo you want to continue? (y/n): ");
                char ch = sc.next().charAt(0);

                if (ch == 'n' || ch == 'N') {
                    break;
                }
            }

            conn.close();
            System.out.println("Program Ended");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}