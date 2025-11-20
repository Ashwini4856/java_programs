import java.util.*;
import CIE.*;
import SEE.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        personal p[] = new personal[n];
        internal in[] = new internal[n];
        external ex[] = new external[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            p[i] = new personal(usn, name, sem);

            int[] internals = new int[5];
            System.out.println("Enter 5 Internal Marks:");
            for (int j = 0; j < 5; j++)
                internals[j] = sc.nextInt();

            in[i] = new internal(internals);

            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE Marks:");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();

            ex[i] = new external(usn, name, sem, seeMarks);
        }

       
        System.out.println("\n\nFINAL MARKS OF STUDENTS");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent: " + p[i].name + " (" + p[i].usn + ")");
            for (int j = 0; j < 5; j++) {
                int finalMarks = in[i].internal[j] + (ex[i].see[j] / 2); 
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}

