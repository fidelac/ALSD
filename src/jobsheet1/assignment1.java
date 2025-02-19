package jobsheet1;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        char[] codeCar = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] city = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the car plate code: ");
        char inputCode = sc.nextLine().charAt(0);
        int index = -1;

        for (int i = 0; i < codeCar.length; i++) {
            if (codeCar[i] == inputCode) {
                index = i;
                break;
            }
        }

        if (index !=-1){
            System.out.print("The car plate code " + inputCode + " is from " );
            for (int i = 0; i < city[index].length;i++){
                System.out.print(city[index][i]);
            }
            System.out.println();
        } else {
            System.out.println("The plate code not found,");
        }
        sc.close();
    }
}
