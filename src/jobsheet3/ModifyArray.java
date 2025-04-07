package jobsheet3;
import java.util.Scanner;

public class ModifyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rectangle: ");
        int arrayLength = sc.nextInt();

        Rectangle[] rectangleArray = new Rectangle [arrayLength];

        for (int i = 0; i < arrayLength; i++){
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < arrayLength; i++){
            System.out.println("Rectangle " + i);
            System.out.println("Width: " + rectangleArray[i].width + ", Length : " + rectangleArray[i].length);
        } 
        sc.close();
    }
}
