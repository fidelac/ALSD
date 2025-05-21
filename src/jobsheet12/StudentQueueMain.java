package jobsheet12;

import java.util.Scanner;

public class StudentQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(5); // Set max size as needed
        int choice;
        do {
            System.out.println("\n=== Student Service Queue Menu ===");
            System.out.println("1. Register Student (Enqueue)");
            System.out.println("2. Call Next Student (Dequeue)");
            System.out.println("3. Display Front Student");
            System.out.println("4. Display Rear Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Queue Size");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Queue is full!");
                        break;
                    }
                    System.out.print("NIM: ");
                    String nm = sc.nextLine();
                    System.out.print("Name: ");
                    String nama = sc.nextLine();
                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    StudentAssignment s = new StudentAssignment(nm, nama, studyProgram, className);
                    queue.enqueue(s);
                    break;
                case 2:
                    StudentAssignment served = queue.dequeue();
                    if (served != null) {
                        System.out.println("Student being served:");
                        served.print();
                    }
                    break;
                case 3:
                    queue.displayFront();
                    break;
                case 4:
                    queue.displayRear();
                    break;
                case 5:
                    queue.displayAll();
                    break;
                case 6:
                    System.out.println("Total students in queue: " + queue.getSize());
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid menu!");
            }
        } while (choice != 0);
    }
}

