package jobsheet6;

public class SortingMain13 {
    public static void main(String[] args) {
    int[] a = {34, 7, 23, 32, 5, 62};
    int[] b = {30, 20, 2, 8, 14};
    int[] c = {40, 10, 4, 9, 3};

    Sorting13 sorting1 = new Sorting13(a);
    System.out.println("Original array: ");
    sorting1.print();
    sorting1.bubbleSort();
    System.out.println("Sorted array (Bubble Sort): ");
    sorting1.print();

    Sorting13 sorting2 = new Sorting13(b);
    System.out.println("Original array: ");
    sorting2.print();
    sorting2.bubbleSort();
    System.out.println("Sorted array (Selection Sort): ");
    sorting2.print();

    Sorting13 sorting3 = new Sorting13(c);
    System.out.println("Original array");
    sorting3.print();
    sorting3.bubbleSort();
    System.out.println("Sorted array (Insertion Sort): ");
    sorting3.print();
    }

}
