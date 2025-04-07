package jobsheet5;

import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = input.nextInt();

        Sum sm = new Sum(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Input profit for " + (i + 1) + "th element: ");
            sm.profits[i] = input.nextDouble();
        }

        System.out.println("Profit total using BF: " + sm.totalBF());
        System.out.println("Profit total using DC: " + sm.totalDC(sm.profits, 0, sm.profits.length - 1));
        input.close();
    }
}
