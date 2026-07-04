import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] marks = new int[n];

        int total = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Student Name: ");
            name[i] = sc.next();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];
        }

        double average = (double) total / n;

        System.out.println("\n------ STUDENT REPORT ------");

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " : " + marks[i]);
        }

        System.out.println("----------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}