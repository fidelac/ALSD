package jobsheet7;

public class MergeSort {
    public void mergeSort(int[] data) {
        int n = data.length;
        sort(data, 0, n - 1);
    }

    public void merge(int data[], int left, int middle, int right){
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++){
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right){
            if (temp[a] <= temp[b]){
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= middle) {
            data[c] = temp[a];
            a++;
            c++;
        }
       
    } 

    private void sort(int data[], int left, int right){
        if (left < right){
            int mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }
    
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Initial Data:");
        ms.printArray(arr);

        ms.mergeSort(arr);

        System.out.println("Sorted Data");
        ms.printArray(arr);
    }
}
    

