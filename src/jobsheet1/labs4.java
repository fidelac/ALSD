package jobsheet1;
import java.util.Scanner;
public class labs4 {
    Scanner sc = new Scanner(System.in);
     static int income = 0;


    static int[] price = { 75000, 50000, 60000, 10000 };
    static String[] flower = {"Aglonema", "Keladi", "Alocasia", "Mawar"}; 
    static int[][] flowerStock = { {10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};
    static int [] flowerDeath = {-1, -2, 0, -5};
    static String [] cabang = {"Royal Garden 1", "Royal Garden 2" , "Royal Garden 3", "Royal Garden 4"};
    public static void main(String[] args) {
    displayRevenue (flower, price, cabang, flowerStock);
    displayBranchStock4 (flower, flowerStock);
    
    }

    public static void displayRevenue(String[] flower, int[] price, String[] cabang, int[][]flowerStock) {
        for (int j= 0; j<flower.length;j++){
            int pendapatan = 0;
            for (int i = 0; i<flowerStock.length; i++){
                pendapatan += flowerStock[i][j] * price[j];
            }
            System.out.printf("Pendapatan %s: IDR %,d%n", flower[j], pendapatan);
        }
    }

    public static void displayBranchStock4(String[] flower, int[][] flowerStock) {
        int[]stockCabang4=flowerStock[3];
        System.out.println("===========================================================");
        System.out.println("Stock in Royal Garden 4 after accounting for flower deaths:");
        for (int i = 0; i < flower.length; i++) {
            int adjustedStock = stockCabang4[i] + flowerDeath[i];
            System.out.printf("%s: %d%n", flower[i], adjustedStock);
        }
    }

    public static void calculateIncome() {
       
        System.out.println(" income of each branch if all the flowers are sold out.");
        for (int i = 0; i < flowerStock.length; i++){
            for (int j = 0; j< flowerStock[i].length; j++){
                income += flowerStock[i][j] * price[j];
            }
            System.out.printf("RoyalGarden %d: IDR %,d%n\", i + 1, income");
            
        }
    }
    
    
}
