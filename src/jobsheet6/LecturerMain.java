package jobsheet6;
import java.util.Scanner;

public class LecturerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData data = new LecturerData();

        while (true) {
            System.out.println("\n Menu");
            System.out.println("1. Add Lecturer");
            System.out.println("2. Display Lecturer");
            System.out.println("3. Sort Lecturer ASC");
            System.out.println("4. Sort Lecturer DSC");
            System.out.println("5. Search Lecturer by Name");
            System.out.println("6. Search Lecturer by Age");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1: 
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Gender (true for Male, false for Female): ");
                    Boolean gender = sc.nextBoolean();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    data.add(new Lecturer(id, name, gender, age));
                    break;
                case 2 :
                    data.print();
                    break;
                case 3 :
                    data.sortingASC();
                    System.out.println("Sorted Lecturer ASC");
                    data.print();
                    break;
                case 4 :    
                    data.sortingDSC();
                    System.out.println("Sorted Lecturer DSC");
                    data.print();
                    break;
                case 5 :
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    int position = data.sequentialSearch(searchName);
                    if (position != -1) {
                        System.out.println("Lecturer found at index: " + position);
                        data.lecturerData[position].print();
                    } else {
                        System.out.println("Lecturer not found");
                    }
                    break;
                case 6 :
                System.out.print("Enter age to search: ");
                int searchAge = sc.nextInt();
                int result = data.binarySearch(searchAge, 0, data.idx - 1);
                if (result != -1) {
                    System.out.println("Lecturer found at index: " + result);
                    data.lecturerData[result].print();
                } else {
                    System.out.println("Lecturer with age " + searchAge + " not found.");
                }
                break;
                case 7 :
                   System.out.println("Exit");;
                    return;
                default :
                    System.out.println("Invalid option");
                    break;
            }
           
        }
    }
}
