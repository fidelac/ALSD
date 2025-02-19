package jobsheet1;
import java.util.Scanner;
public class assignment2 {

    static double calculateVolume(double side) {
        return Math.pow(side,3);
    }

    static double calculateSurfaceArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    static double calculatePerimeter(double side) {
        return 12 * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a side of the cube: ");
        double side = sc.nextDouble();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Volume");
            System.out.println("2. Calculate Surface Area");
            System.out.println("3. Calculate Perimeter (Total Edge Length)");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    double volume = calculateVolume(side);
                    System.out.println("Volume of the cube: " + volume);
                    break;
                case 2:
                    double surfaceArea = calculateSurfaceArea(side);
                    System.out.println("Surface Area of the cube: " + surfaceArea);
                    break;
                case 3:
                    double perimeter = calculatePerimeter(side);
                    System.out.println("Perimeter (Total Edge Length) of the cube: " + perimeter);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

