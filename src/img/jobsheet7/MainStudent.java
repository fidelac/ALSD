package jobsheet7;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        searchStudent data = new searchStudent(numStudents);

        System.out.println("-------------------------------------------------");
        System.out.println("Input student data accordingly from smallesst NIM");
        for (int i = 0; i < numStudents; i++){
            System.out.println("---------------------------------------------");
            System.out.print("NIM\t:");
            int nim = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
            System.out.print("Name\t:");
            String name = sc.nextLine();
            System.out.print("Age\t:");
            int age = sc.nextInt();
            System.out.print("GPA\t:");
            double gpa = sc.nextDouble();

            Student std = new Student(nim, age, name, gpa);
            data.add(std);
        }
            System.out.println("------------------------------");
            System.out.println("Entire Student Data");
            data.display();
            System.out.println("______________________________");
            System.out.println("______________________________");
            System.out.println("Search student by NIM");
            System.out.print("Using Binary Search");
            int search = sc.nextInt();
            int position1 = data.FindBinarySearch( search,0 ,numStudents -1);

            data.showPosition(search, position1);
            data.showData(search, position1);

            sc.close();
    }

}
