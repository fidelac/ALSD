package jobsheet12;

import java.util.Scanner;

public class MainModify {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------");
            System.out.print("Enter student ID: ");
            String nm = sc.nextLine();
            System.out.print("Enter student name: ");
            String nama = sc.nextLine();
            System.out.print("Enter student class: ");
            String kls = sc.nextLine();
            System.out.print("Enter student GPA: ");
            double ip = sc.nextDouble();
            sc.nextLine(); 

            Student std = new Student(nm, nama, kls, ip);
            sll.addLast(std);
        }

        sll.print();
    }
}
