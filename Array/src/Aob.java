/** 
 *  array of objects without constructor
 * @author {Kireet Joshi}
 */

import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    // Constructor
    Student(int i, String n, int m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + marks);
    }
}

public class Aob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Array of objects
        Student[] s = new Student[n];

        // Taking input and creating objects
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            s[i] = new Student(id, name, marks);
        }

        // Displaying data
        System.out.println("\nStudent Details:");
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }

        sc.close();
    }
}
