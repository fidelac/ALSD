package jobsheet3;
import java.util.Scanner;

public class LecturerDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lecturer: ");
        int input = sc.nextInt();
        sc.nextLine();

        Lecturer13[] lecturerArray = new Lecturer13[input];
        for (int i = 0; i < input; i++){
            System.out.println("Enter detail for lecturer" + ( i + 1));
            System.out.print("Lecturer ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Gender ('true' for Male, 'false' for Female): ");
            boolean gender = sc.nextBoolean();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println();
            lecturerArray[i] = new Lecturer13(id, name, gender, age); 

        }
        System.out.println("--------------- Lecturer ----------------------");
        LecturerData13.showAllLecturerData(lecturerArray);
        System.out.println("-----------------------------------------------");
        LecturerData13.countLecturerByGender(lecturerArray);
        System.out.println("-----------------------------------------------");
        LecturerData13.averageLecturerAgeByGender(lecturerArray);
        System.out.println("-----------------------------------------------");
        LecturerData13.showOldestLecturerInfo(lecturerArray);   
        System.out.println("-----------------------------------------------");
        LecturerData13.showYoungestLecturerInfo(lecturerArray);   
        sc.close(); 
    }
   
}
