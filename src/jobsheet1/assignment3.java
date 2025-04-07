package jobsheet1;
import java.util.Scanner;

public class assignment3{
    static String[] courseNames;
    static int[] creditHours;
    static int[] semesters;
    static String[] lectureDays;
    static int courseCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        courseNames = new String[n];
        creditHours = new int[n];
        semesters = new int[n];
        lectureDays = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for course " + (i + 1) + ":");
            System.out.print("Course Name: ");
            courseNames[i] = sc.nextLine();
            System.out.print("Credit Hours (SKS): ");
            creditHours[i] = sc.nextInt();
            System.out.print("Semester: ");
            semesters[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Lecture Day: ");
            lectureDays[i] = sc.nextLine();
            courseCount++;
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Display all courses");
            System.out.println("2. Display courses on a specific day");
            System.out.println("3. Display courses for a specific semester");
            System.out.println("4. Search for a course by name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayAllCourses();
                    break;
                case 2:
                    System.out.print("Enter the day: ");
                    String day = sc.nextLine();
                    displayCoursesByDay(day);
                    break;
                case 3:
                    System.out.print("Enter the semester: ");
                    int semester = sc.nextInt();
                    displayCoursesBySemester(semester);
                    break;
                case 4:
                    System.out.print("Enter the course name to search: ");
                    String courseName = sc.nextLine();
                    searchCourse(courseName);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    
    static void displayAllCourses() {
        System.out.println("\nAll Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("Course Name: " + courseNames[i] +
                               ", Credit Hours: " + creditHours[i] +
                               ", Semester: " + semesters[i] +
                               ", Lecture Day: " + lectureDays[i]);
        }
    }

    static void displayCoursesByDay(String day) {
        System.out.println("\nCourses on " + day + ":");
        boolean found = false;
        for (int i = 0; i < courseCount; i++) {
            if (lectureDays[i].equalsIgnoreCase(day)) {
                System.out.println("Course Name: " + courseNames[i] +
                                   ", Credit Hours: " + creditHours[i] +
                                   ", Semester: " + semesters[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found on " + day + ".");
        }
    }

    static void displayCoursesBySemester(int semester) {
        System.out.println("\nCourses for Semester " + semester + ":");
        boolean found = false;
        for (int i = 0; i < courseCount; i++) {
            if (semesters[i] == semester) {
                System.out.println("Course Name: " + courseNames[i] +
                                   ", Credit Hours: " + creditHours[i] +
                                   ", Lecture Day: " + lectureDays[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found for Semester " + semester + ".");
        }
    }

    static void searchCourse(String courseName) {
        boolean found = false;
        for (int i = 0; i < courseCount; i++) {
            if(courseNames[i].equalsIgnoreCase(courseName)) {
                System.out.println("Course Found:");
                System.out.println("Course Name: " + courseNames[i] +
                                   ", Credit Hours: " + creditHours[i] +
                                   ", Semester: " + semesters[i] +
                                   ", Lecture Day: " + lectureDays[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course '" + courseName + "' not found.");
        }
    }
}