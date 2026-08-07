import java.util.Scanner;

public class Lec3Bubble {
    public static void print(int[] arr) {
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // QUESTIONS 
        // sorting --> arrangementt of element in ascending or descending order 
        // sort arr --> if question me kuch nhi de rakha ho toh arrange in ass order --> { -1,0, 1, 2, 3, 4,7, 9}

// check if aaray is sorted 
        // int[] arr = { 3, 5, 2, 0, -1, 6, 5, 8, 8 };
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i] > arr[i + 1])
        //         System.out.print(arr[i]);
        // }
        // System.out.print(" Value does not find "); 
        

// Bubble sort // ascending order 
        int[] arr = { 2, 4, -1, 3, 2, 5, 8, 7, 6 };
        int n = arr.length;
        print(arr);
        // for (int i=0; i<n-1; i++) { // // these re n-1 passes
        //     for (int j=0; j<n-1-i; j++) { // n-1-i , loop kam chalega , jo num big aayega bah last me fix ho jayega 
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];  // swap elem
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // print(arr);    // time complaxity O(n^2)

// Another method to solve BUBBLE SORT  // descending order
        // for (int i = 0; i < n - 1; i++) { 
        //     int swaps = 0;
        //     for (int j = 0; j < n - 1 - i; j++) { 
        //         if (arr[j] < arr[j + 1]) {
        //             int temp = arr[j]; // swap elem
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //             swaps++;
        //         }
        //     }
        //     if(swaps == 0) break; // if swaps zero at last then break
        // }
        // print(arr); // time complaxity O(n^2)

 // Move all zeroes to end of arr // SOLVE ON LEET CODE
        // int[] arr = { 2,0, 4, 0, -1, 3, 2, 0, 5, 8, 7, 6 };   
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - 1 - i; j++) {
        //         if (arr[j] == 0 ) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // print(arr); 
        
// Selection Shorting Bubble 
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        
        print(arr);

        
    }
}
