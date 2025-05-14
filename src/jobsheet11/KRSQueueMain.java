package jobsheet11;

import java.util.Scanner;

public class KRSQueueMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_QUEUE = 10;
        final int MAX_STUDENTS = 30;
        KRSQueue queue = new KRSQueue(MAX_QUEUE);

        int choice;
        do {
            System.out.println("\n=== KRS Approval Queue Menu ===");
            System.out.println("1. Register Student (Enqueue)");
            System.out.println("2. Process KRS Approval (Dequeue 2)");
            System.out.println("3. Show All Students in Queue");
            System.out.println("4. Show First Two Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Clear Queue");
            System.out.println("7. Show Statistics");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (queue.size + queue.approved >= MAX_STUDENTS) {
                        System.out.println("Maximum number of students reached!");
                        break;
                    }
                      System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    Student s = new Student(nim, name, studyProgram, className);
                    queue.enqueue(s);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printAll();
                    break;
                case 4:
                    queue.printFirstTwo();
                    break;
                case 5:
                    queue.printRear();
                    break;
                case 6:
                    queue.clear();
                    break;
                case 7:
                    queue.printStats(MAX_STUDENTS);
                    break;
                case 0:
                    System.out.println("Thank you for using the KRS Approval Queue System!");
                    break;
                    default:
                    System.out.println("Invalid menu!");
            }
        } while (choice != 0);
    }
}
