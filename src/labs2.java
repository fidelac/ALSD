import java.util.Scanner;

public class labs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input NIM: ");
        long nim = sc.nextLong();

        int n = (int)(nim % 100);
        if (n < 10) {
            n = n + 10;
        }

        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                System.out.print("");
            } else {
                if (i % 2 == 0) {
                    System.out.print(" " + i);
                } else if (i % 2 != 0) {
                    System.out.print(" * ");
                }
            }
            sc.close();
        }
    }
}
