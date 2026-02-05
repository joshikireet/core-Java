
/**
 * without constructor Array of objects
 * @author {Kireet Joshi}
 *
 */
import java.util.Scanner;

class Student1 {
    int id;
    String name;
    int marks;

    // Normal method to assign values
    void setData(int i, String n, int m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + marks);
    }
}

public class Aob1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Array of objects
        Student1[] s = new Student1[n];

        // Creating objects and taking input
        for (int i = 0; i < n; i++) {

            s[i] = new Student1();   // object creation

            System.out.print("\nEnter ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // Assigning values using normal method
            s[i].setData(id, name, marks);
        }

        // Display using for-each loop
        System.out.println("\nStudent Details:");
        for (Student1 st : s) {
            st.display();
        }

        sc.close();
    }
}
