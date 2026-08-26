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
}