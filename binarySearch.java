import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sort arrys
        int[] arr = { 2, 5, 7, 1, -89, 6, 90, -23 };
        Arrays.sort(arr);
        int n = arr.length;
        // BINARY SEARCH 
        int target = 903;
        // int low = 0, high = n - 1; // low or high like as i or j index
        // boolean found = false;
        // while (low <= high) {
        //     int mid = (low + high) / 2;
        //     if (arr[mid] == target) {
        //         System.out.print("Elem found at index: " + mid);
        //         found = true;
        //         break;
        //     } else if (arr[mid] < target)
        //         low = mid + 1;
        //     else
        //         high = mid - 1;

        // }
        // if (!found) {
        //     System.out.print("Elem not found: " + -1);
        // }
        // FIRST occurence 
        int lo = 0, hi = arr.length - 1, idx = -1;
        boolean found = false;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > target)
                hi = mid - 1; // go left 
            else if (arr[mid] < target)
                lo = mid + 1; // go right
            else { // arr of [mid] == target 
                idx = mid;
                hi = mid - 1;
                System.out.print("Elem found at index: " + mid);
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.print("Elem not found: " + -1);
            
        }
    }
}
