import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class index {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // int[] x = { 10, 20, 45, 56, 63 };
      // System.out.println(x[3]);
      // // update element
      // x[2] = 54;
      // System.out.println(x[2]);
      // int[] arr = { 34, 544, 32, 45, 56, -76, 66, 55 };
      // System.out.println(arr.length);
      // int n = arr.length;
      // for(int i=0; i <n ; i++) {
      // System.out.print(arr[i]+ " ");
      // }
      // We take input using this: sc.nextInt
      // int[] arr = new int[7];
      // for (int i = 0; i < arr.length; i++) {
      // arr[i] = sc.nextInt();
      // System.out.print(2*arr[i] + " ");
      // }
      // System.out.print("Enter array size: ");
      // int n = sc.nextInt();
      // int[] arr = new int[n];
      // System.out.print("Enter Array Element: ");
      // for (int i=0; i<n; i++)
      // arr[i] = sc.nextInt();
      // // print negatve values
      // for (int i = 0; i < n; i++)
      // if(arr[i]<0) System.out.print(arr[i]+ " ");
      // Sum of arr
      // int[] arr = { -4, 2, 3, 4, -90 };
      // int sum = 0;
      // for (int i = 0; i < arr.length; i++) {
      // sum += arr[i];
      // }
      // System.out.println(sum);
      // Producct of arr
      // int[] arr = { 2, 4, 7 ,32 };
      // int sum = 1;
      // for (int i = 0; i < arr.length; i++) {
      // sum *= arr[i];
      // }
      // System.out.println(sum);
      // Maximum element in arr
      // int[] arr = { 2, 4, 7, 32 };
      // int max = arr[0];
      // // int max = Integer.MIN_VALUE; // for better understanding
      // for (int i = 0; i <arr.length; i++) {
      // if(arr[i]>max) max = arr[i];

      // }
      // System.out.println(max);
      //  find second maximum ellem in an arr

      // int[] arr = { 24, 45, 35, 43,67 , 1100 };
      // int max = 0;
      // int smax = 0;
      // // calculate max value
      // for (int i = 0; i < arr.length; i++) {
      //         if(arr[i]>max) max = arr[i]; }
      // // calculate second maximum value 
      // for (int i = 0; i <arr.length; i++) {
      //         if (arr[i] > smax && arr[i] != max)
      //                 smax = arr[i];

      // }
      // System.out.println(max);
      // System.out.println(smax);

      // Minimum ele in arr

      // int[] arr = { 2, 4, 7, 32 };
      // int min = arr[0];
      // //int min = Integer.MAX_VALUE; // for better understanding
      // for (int i = 0; i <arr.length; i++) {
      // if(arr[i]<min) min = arr[i];

      // }
      // System.out.println(min);
      // string
      // String[] arr = {"Abinav", "Kunal", "Siddharth"};
      // for (int i = 0; i <arr.length; i++) {
      // System.out.print(arr[i]+ " ");
      // }
      // Methos of arr
      // int[] arr = { 10, 20, 30, 40 };
      // int[] x = arr; // x is the shallo copy of arr, means arr == x
      // x[0] = 1000;
      // System.out.println(arr[0]);
      // deep mathods copy of an arr;
      // int[] arr = { 50, 30, 60, 80 };
      // int[] y = Arrays.copyOf(arr, arr.length); // deep copy
      // y[0] = 100;
      // System.out.println(y[0]);
      // System.out.println(arr[0]);
      // Mutli odd index elem by 2 and add 10 to even intex elem
      // int[] arr = { 20, 30, 35, 40 };
      // for (int i = 0; i < arr.length; i++) {
      // if (i%2==1) arr[i] *= 2;
      // else
      // arr[i] += 10;
      // System.out.print(arr[i] + " ,"); // }
      // Search in all element
      // int[] arr = { 2, 3, 45, 56 };
      // int target = 3;
      // int found = -1; // -1 means target does not exists in an arr

      // for (int i = 0; i < arr.length; i++) {
      // if (arr[i] == target) {
      // found = i; // i means any no.except -1, target exists in an arr
      // break;

      // }
      // }
      // if (found != -1)
      // System.out.println("Target exists in arr at index: " + found);
      // else System.out.println("Target missing in arr");
      // Two sum of an arr
      // int[] arr = { 1, 4, 6, 7 };
      // int n = arr.length;
      // int target = 10;
      // for (int i = 0; i < n; i++) {
      //         for (int j = i + 1; j < n; j++) {
      //                 if (arr[i] + arr[j] == target) 
      //                         System.out.println("Target value");

      //         }
      // }
      // System.out.println("kuch nhi");
      // fore loop 
      // int[] arr = { 2, 4, 5, 6, 7, 8, };
      // for (int elem : arr) { // int elem in arr 
      //         System.out.print(elem + " ");
      // }

      // Reverse array or 2 variable // pending on leet code 

      // int[] arr = { 3, 19, 57, 50, 78, 37, 90 };
      // int n = arr.length;
      // int i = 0, j = n - 1;         // int i = 2, j = n - 3; this is reverse part in an arr
      // while (i < j) {
      //         int temp = arr[i];
      //         arr[i] = arr[j];
      //         arr[j] = temp;
      //         i++;
      // }
      // for (int elem : arr)  System.out.print(elem + " ");
      // Rotate arr solve on leet code 
      // this is leet code // missing an arr 
      // good question 
      // int [] arr = {1, 2, 3, 5};
      // int n = arr.length + 1; // numbers are 1 to n
      // int sum = n * (n + 1) / 2;
      // int arrSum = 0;
      // for (int elem : arr) {
      //     arrSum += elem;
      //     System.out.println(sum);
      //     System.out.println(arrSum);
      // }
      // System.out.println(sum - arrSum);
      // Segregate 0s and 1s 
      //     int[] arr = { 1, 1, 0, 1, 0, 1, 0 };
      //     int n = arr.length;
      //     int i=0, j=n-1;
      //     while (i < j) {
      //         if (arr[i] == 0)
      //             i++;
      //         else if(arr[j] == 1)j--;
      //         else if(i > j);                      
      //         else if (arr[i] == 1 && arr[j] == 0) {
      //             arr[i] = 0;
      //             arr[j] = 1;
      //             i++;
      //             j--;
      //         }
      //     }
      //    System.out.println(Arrays.toString(arr));
      // Wave arr
      // int[] arr = { 1,3,2,2,3,1};
      // for (int i = 0; i < arr.length -1; i += 2) { // loop run at second last index
      //     // if (i == arr.length - 1) // loop run at last index
      //     //     break;
      //     int temp = arr[i];
      //     arr[i] = arr[i + 1];
      //     arr[i + 1] = temp;
      // }
      //    System.out.println(Arrays.toString(arr));
      // creating Arraylist
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(18);
      arr.add(48);
      arr.add(28);

      System.out.println(arr.get(2)); // like as aar[2]
      arr.set(2, 100); // like as arr[3] = 100
      //    System.out.println(arr); // print whole list loop wise , not traversing the arr by ourselves 
      //    int n = arr.size(); // like as arr.length
      //    for (int i = 0; i < n; i++) {
      //        System.out.print(arr.get(i) + " ");
      //    }
      //    for (int elem : arr) {
      //        System.out.println(elem + " ");
      //    }
      // 18 , 48, 100
      //    arr.add(59);
      //    int i = 0, j = arr.size() - 1;
      //    while (i < j) {
      //        int temp = arr.get(i);
      //        arr.set(i, arr.get(j)); // put in i index j value 
      //        arr.set(j, temp);
      //        i++;
      //        j--;
      //    }
      //    System.out.println(arr);

      // plus one on leet code 

      // Step 1: Initialize Vector to store digits in reverse order
      // Vector<Integer> ans = new Vector<>();
      // int n = arr.length;
      // int carry = 1; // We start with a carry of 1 to add "plus one"

      // // Step 2: Iterate through the input array from right to left (least to most significant digit)
      // for (int i = n - 1; i >= 0; i--) {
      //     if (arr[i] + carry <= 9) {
      //         ans.add(arr[i] + carry); // Current digit + carry fits in a single digit (0-9)
      //         carry = 0;               // Carry resolved, set to 0
      //     } else {
      //         ans.add(0);              // e.g., 9 + 1 = 10 -> current digit becomes 0
      //         carry = 1;               // Carry continues to the next left digit
      //     }
      // }

      // // Step 3: If there's still a carry remaining after processing all digits (e.g., [9, 9] -> carry = 1)
      // if (carry == 1) {
      //     ans.add(1);
      // }

      // // Step 4: Reverse the vector because we processed the numbers from right to left
      // Collections.reverse(ans);

      // // Step 5: Convert the Vector<Integer> into standard primitive array int[] required by LeetCode
      // int[] result = new int[ans.size()];
      // for (int i = 0; i < ans.size(); i++) {
      //     result[i] = ans.get(i);
      // }

      // // Step 6: Return the primitive array result (NOT the Vector ans)
      // return result; 
// merge two sorted array 
        int[] a = { 2, 5, 9, 20 };
        int[] b = { 1, 3, 4, 6, 7, 8 };
        int[] c = new int[a.length + b.length];
        for (int elem : c) System.out.println(elem + " ");
        merge(c, a, b);
        for (int elem : c) System.out.println(elem + " ");
         //  int i = 0, j = 0, k = 0;
        public static  merge(int[] c , int[] a, int[] b){
         int i = 0, j = 0, k = 0;
      while (i < a.length && j < b.length) {
         if (a[i] < b[j]) {
            c[k] = a[i];
            i++;
            k++;
         }
         else {
            c[k] = b[j];
            j++;
            k++;
         }
         // a all elem in arr finish, now fill it b elem 
            while(j<b.length){
               c[k++] = b[j++];
            }
         }
         // b all elem in arr finish, now fill it a elem 
            while(j<a.length){
               c[k++] = a[j++];
         }
      }
}
    
        

