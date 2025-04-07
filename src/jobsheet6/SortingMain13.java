package jobsheet6;

public class SortingMain13 {
    public static void main(String[] args) {

        int[] a = { 34, 7, 23, 32, 5, 62 };
        Sorting13 sorting = new Sorting13(a);
        System.out.println("Original array: ");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort): ");
        sorting.print();
    }

}
