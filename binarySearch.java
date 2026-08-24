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
        // int lo = 0, hi = arr.length - 1, idx = -1;
        // boolean found = false;
        // while (lo <= hi) {
        //     int mid = (lo + hi) / 2;
        //     if (arr[mid] > target)
        //         hi = mid - 1; // go left 
        //     else if (arr[mid] < target)
        //         lo = mid + 1; // go right
        //     else { // arr of [mid] == target 
        //         idx = mid;
        //         hi = mid - 1;
        //         System.out.print("Elem found at index: " + mid);
        //         found = true;
        //         break;
        //     }
        // }
        // if (!found) {
        //     System.out.print("Elem not found: " + -1);
            
        // }
// Last occurence 
        // int lo = 0, hi = arr.length - 1, idx = -1;
        // boolean found = false;
        // while (lo <= hi) {
        //     int mid = (lo + hi) / 2;
        //     if (arr[mid] < target) lo = mid + 1;
        //     else if (arr[mid] > target) hi = mid - 1;
        //     else {// target occur 
        //         idx = mid; // mark index number 
        //         lo = mid + 1;// go right 
        //         System.out.print("Elem found at index: " + mid);
        //         found = true;
        //         break;      
        //     }           
        // }
        // if (!found) {
        //     System.out.print("Elem not found: " + -1);
        // }

//search in a mountain araay ???   SOLVE ON LEET CODE     
        // int lo = 1, hi = arr.length -2;
        // first and last elem,in these two no one is peak elem , so -2 sec last elem 
        // while(lo<=hi){
        //     int mid = (lo+hi)/2;
        //     if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        //     else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid + 1;
        //     else hi = mid -1;
        // }return -12;
        
// Floor in a sorted array     
            // int lo =0, hi= arr.length-1;
            // while(lo<=hi){
            //     int mid = (lo+hi)/2;
            //     if(arr[mid] == target) {
            //         return mid;}  // target found  
            //     else if (arr[mid]>target) {
            //         hi = mid - 1;} // go left
            //     else {
            //         lo = mid + 1; // ho right 
            //     }
            // }// if in case not found , 'lo' represent the correct insert positon
            // return lo;
// Sqare root 
        long lo =0, hi = x; // long because of big value 
        while(lo<=hi){
            long mid = (lo+hi)/2;
            if(mid*mid == x) return (int)mid;
            // mid*mid value bhut bada ho jayega int usse store nhi kr payega that in this case we use long
            else if(mid*mid>x) hi = mid-1; // go left
            else lo = mid + 1 ; // go right
        }return (int)hi; // perfect sq not found
    }
}


// USING RECURSION
// BINARY SEARCH PROBLEM 
    public int binary(int[] arr, int target, int low, int high) {
        if (low > high)return -1;
        int mid = low + (high - low) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return binary(arr, target, low, mid-1);
        else return binary(arr, target, mid + 1, high);
    }
    public int search(int[] arr, int target) {
        int n = arr.length;
        return binary(arr, target, 0, n - 1);
    }
   
