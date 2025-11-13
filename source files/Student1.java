import java.util.Scanner;

class Student1 {
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int n;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USN:");
        usn = sc.nextLine();
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter number of subjects:");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        System.out.println("Enter credits for each subject:");
        for (int i = 0; i < n; i++) {
            credits[i] = sc.nextInt();
        }

        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
    }

    int getGradePoint(int mark) {
        if (mark >= 90)
            return 10;
        else if (mark >= 80)
            return 9;
        else if (mark >= 70)
            return 8;
        else if (mark >= 60)
            return 7;
        else if (mark >= 50)
            return 6;
        else if (mark >= 40)
            return 5;
        else
            return 0;
    }

    double calculateSGPA() {
        int totalCredits = 0;
        int totalPoints = 0;

        for (int i = 0; i < n; i++) {
            int gradePoint = getGradePoint(marks[i]);
            totalCredits += credits[i];
            totalPoints += gradePoint * credits[i];
        }

        if (totalCredits == 0)
            return 0.0;

        return (double) totalPoints / totalCredits;
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.print("Credits: ");
        for (int c : credits) {
            System.out.print(c + " ");
        }
        System.out.println("\nMarks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.printf("\nSGPA: %.2f\n", calculateSGPA());
    }

    // MAIN method to run the program
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.acceptDetails();
        s.displayDetails();
    }
}
