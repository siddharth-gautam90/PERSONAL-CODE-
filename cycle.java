import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class cycle {
    public static void main(String[] args) {
            int[] arr = { 2, 45, 12, 45, 67, 89 };
            int i = 0;
            int n = arr.length;
            while (i < n) {
                if (arr[i] == i)
                    i++;
                else {
                    int idx = arr[i];
                    int temp = arr[idx];
                    arr[idx] = arr[i];
                    arr[i] = temp;
                    System.out.print(arr[i]);
    
                }
            }
             System.out.print(arr[i]);
        }

// MISSING NUMBER 268
            int missingNum(int arr[]) {
                int n = arr.length; // 0 to n
                int i = 0;
                while (i < arr.length) {
                    if (arr[i] == i || arr[i] == n)
                        i++;
                    else {
                        int idx = arr[i] ; // idx number se ek kaam hoga 0 -->1 , 1-->2, 2--> 3
                        swap(arr, i, idx);
                    }
                }
                for (i = 0; i < arr.length; i++) {// firse loop chalao num ko uske ind pr match krne k liye
                    if (arr[i] != i)
                        return i;
                }
                return n;
            }
            public static void swap(int[] arr, int i, int idx) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }

/// find duplicate number --> 287
            public int findDuplicate(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    while (arr[i] != i + 1) {
                        int correctIdx = arr[i] - 1;
                        if (arr[i] == arr[correctIdx])
                            return arr[i];// dup
                        int temp = arr[i];
                        arr[i] = arr[correctIdx];
                        arr[correctIdx] = temp;
                    }
                }
                return -1;
            }

// Array Duplicate 
            public ArrayList<Integer> findDuplicate(int[] arr) {
                ArrayList<Integer> ans = new ArrayList<>();
                int n = arr.length;
                int i = 0; // 1 to n 
                while (i < n) {
                    int rightIdx = arr[i] - 1;
                    if (arr[i] == i + 1 || arr[rightIdx] == arr[i]) i++;
                    else swap(arr, i, rightIdx);
                }
                for ( i = 0; i < n; i++) {// firse loop chalao num ko uske ind pr match krne k liye
                    if (arr[i] != i + 1) ans.add(arr[i]);
                }
                return ans;
            }
        
            public static void swap(int[] arr, int i, int idx) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }

    // FIND ALL NUMBERS DISAPPEARED IN AR ARRAY 448 [4 , 3, 2, 7, 8, 2, 3, 1] ouyput [5, 6]
            public List<Integer> findDisappearedNumbers(int[] arr) {
                List<Integer> ans = new ArrayList<>();
                int n = arr.length;
                int i = 0; // 1 to n 
                while (i < n) {
                    int rightIdx = arr[i] - 1;
                    if (arr[i] == i + 1 || arr[rightIdx] == arr[i]) i++;
                    else swap(arr, i, rightIdx);
                }
                for ( i = 0; i < n; i++) {// firse loop chalao num ko uske ind pr match krne k liye
                    if (arr[i] != i + 1)ans.add(i+1);
                }
                return ans;
            }
            public static void swap(int[] arr, int i, int idx) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }

// FIRST MISSING POSITIVE NUMBER 
                public int firstMissingPositive(int[] arr) {
                    int i = 0, n = arr.length;
                    while (i < n) {
                        // arr[i] == arr[arr[i] - 1] --> rightidx 
                        if (arr[i] <= 0)i++; // IGNORE NEGATIVE NUMBERS
                        else if (arr[i] > n) i++; // IF NUMBER bigger than array
                        else if (arr[i] == i + 1) i++; //  NUMBER AT ALREADY CORRECT PLACE 
                        else if (arr[i] == arr[arr[i] - 1]) i++; // IF NUMBER DUPLICATE NUMBER OR BAH NUMBER BAHI PLACE HAI 
                        // if (arr[i] <= 0 || arr[i] > n || arr[i] == i + 1 || arr[i] == arr[arr[i] - 1]) i++; // ONE LINE
                        
                        else swap(arr, i, arr[i] -1); // if above case me se kuch nhi hua 
                    }
                    for ( i = 0; i < n; i++) {// firse loop chalao num ko uske ind pr match krne k liye
                        if(arr[i] != i +1 ) return i+1;
                    }
                    return n+1;
                }
                public static void swap(int[] arr, int i, int idx) {
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                }

    // Set/array  match  -- > 645
}
