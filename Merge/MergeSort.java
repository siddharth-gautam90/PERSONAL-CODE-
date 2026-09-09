import java.util.Scanner;



// MERGE & INVERSION COUNT
public class merge {
    public static void main(String[] args) {
        int[] arr = { 2, 56, 12, 78, 90, -8, -6, 0 };
        mergeSort(arr);
        for(int elem : arr) System.out.print(elem+ " ");
    }

    // MERGE SORT USING RECURSION
    public static void mergeSort(int[] arr) {
        int n = arr.length; // step - 1: Create a new empty arrays of size n/2
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        // Step 2: copy paste arr into a and b
        int idx = 0; // idx travel in whole arr
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];
        // STEP 3:  MERGE ARR-->
        mergeSort(a);
        mergeSort(b);

        // Step 4 : merge "a" and 'b' into arr
        merge(a, b, arr);
    }
    public static void merge(int[] a , int[] b, int[] c) {
        // Scanner sc = new Scanner(System.in);

        // MERGE TWO SORTED ARRAYS
        int i = 0, j = 0, k = 0;
        while (i < a.length && j<b.length) {
            if (a[i] <=b[j])c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length)c[k++] = a[i++];
        while (j < b.length)c[k++] = b[j++];
    }

    
    // COUNT INVERSION [2, 4, 1,, 3, 5] (2, 1)(4,1)(4, 3)
    static int count; // GLOBAL VARIABLE

    static int inversionCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;

       // Another method to solve it Through merge sort
        count = 0;
        mergeSort(arr);
        return count;
    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;  // BASE CASE: Stop recursion when subarray has 0 or 1 element
         // step - 1: Create a new empty arrays of size n/2
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        // Step 2: copy paste arr into a and b
        int idx = 0; // idx travel in whole arr
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];
        // STEP 3:  MERGE ARR-->
        mergeSort(a);
        mergeSort(b);

        // Step 4 : merge "a" and 'b' into arr
        merge(a, b, arr);
    }
    public static void merge(int[] a , int[] b, int[] c) {
        // Scanner sc = new Scanner(System.in);

        // MERGE TWO SORTED ARRAYS
        int i = 0, j = 0, k = 0;
        while (i < a.length && j<b.length) {
            if (a[i] <=b[j])c[k++] = a[i++];
            else { // [
               count += (a.length - i);
                c[k++] = b[j++];
            } 
        }
        while (i < a.length)c[k++] = a[i++];
        while (j < b.length)c[k++] = b[j++];
    }
}
