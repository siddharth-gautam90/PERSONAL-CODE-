
import java.util.Scanner;

public class recursion {
    // public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter base num: ");
    // System.out.println("Enter 1st num: ");
    // int a = sc.nextInt();
    // //System.out.println("Enter exponent num: ");
    // System.out.println("Enter 2nd num: ");

    // int b = sc.nextInt();
    // // System.out.println(a + " Raised to the power " + b + " is " + pow(a, b));
    // System.out.println(a + " i is a factor of " + b + " highest factor is  " + gcd(a, b));

    // public static int reverse(int n, int r) {
    //     if (n == 0)return r;
    //     return reverse( n/10, r*10 + n%10);
    // }

    // powers of the numbers 
    // public static int pow(int a, int b) {
    //     if (b == 0)return 1;
    //     int call = pow(a, b / 2);
    //     if (b % 2 == 0)return call * call;
    //     else return call * call * a;
    // }

    // public static int reverseExponentiation(int a, int b) {
    //     if (b == 10)return 10;
    //     return pow(a, b-1);
    // }
    // reverse of the number 

    // int n = 1234;
    // System.out.println(reverse(n, 0));

    // reverse of the number 
    // int n = 25467;
    // int r = 0;
    // while(n! = 0){
    //     r +=10;
    //     r += (n%10);
    //     n /= 10;
    // }
    // System.out.println(r);

    // a to the power base 

    // }
    // public static int pow(int a, int b) {
    //     if (b == 0)return 1;
    //     int call = pow(a , b/2);
    //     if (b % 2 == 0)return call * call;
    //     // if (b % 2 == 0)return pow(a, b / 2) * pow(a, b / 2);
    //     else return a * pow(a, b / 2) * pow(a, b / 2);

    // GCD OF 2 numbers 
    // public static int gcd(int a, int b) {
    //     int hcf = 1;
    // for(int i =2; i<Math.min(a,b); i++){
    //     if(a%i==0 && b%i == 0){
    //         hcf = i;
    //     }
    // }
    // return hcf;

    // RECURSION ON Array

    // int[] arr = { 2, 5, 7, 4, 1, 0, 9, 6, 3, 34, 56, 67, 77 };
    // Arrays.sort(arr);
    // recPrint(arr, 0);
    // int n = arr.length;
    //recPrint(arr, 0);// reverse 

    // int target = 34;
    // System.out.println(exists(arr, target, 0));

    // int[] arr = { 23, 45, 23, 56 };
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i] + " ");
    // }
    // String[] ann = { "Siddhu", "Anuj-", "Massom" };
    // ArrayList<String> al = new ArrayList<>();
    // al.add("RAJ");
    // al.add("Himanshu");
    // al.add("Ritesh");
    // System.out.println(al);
    // for (int i = 0; i < ann.length; i++) {
    //     System.out.print(ann[i] + al);
    // }

    // for (int i = 0; i < ann.length; i++) {
    //     System.out.print(ann[i]+ " ");
    // }

    // }

    // public static boolean exists(int[] arr, int target, int idx) {
    //     if (idx == arr.length)
    //         ;
    //     if (arr[idx] == target)
    //         return true;
    //     return exists(arr, target, idx + 1);
    // }

    // public static void recPrint(int [] arr , int idx) {
    //     int n = arr.length;
    //     if (idx == n)return;
    //     // if (idx < 0)return;
    //     recPrint(arr, idx + 1);
    //     System.out.print( arr[idx] + " " );

    // public static void main(String[] args) {
    //     pip(2);
    // }

    // // PRE IN POST
    // public static void pip(int n) {
    //     if (n == 0) return;
    //     System.out.print(n + " "); // PRE
    //     pip(n - 1); // yah tak 321 print hoga 
    //     System.out.print(n + " ");// IN // yah tak 123 print hoga 
    //     pip(n - 1);
    //     System.out.print(n + " ");// POST
    // } // n = 1 --> 1 1 1  , n = 2 --> // 2 1 1 1 2 1 1 1 2 

    // BINARY SEARCH PROBLEM // USING RECURSION
    // public int binary(int[] arr, int target, int low, int high) {
    //     if (low > high)return -1;
    //     int mid = low + (high - low) / 2;
    //     if(arr[mid] == target) return mid;
    //     else if(arr[mid] > target) return binary(arr, target, low, mid-1);
    //     else return binary(arr, target, mid + 1, high);
    // }

    // public int search(int[] arr, int target) {
    //     int n = arr.length;
    //     return binary(arr, target, 0, n - 1);
    // }

    // GOOD QUESTIONS 

    // PRINT SUBSETS     DRY RUN THIS CODE FOR BETTER UNDERSTANDING
    // public static void main(String[] args) {
    //     String s = "abc";
    //     List<String> list = new ArrayList<>();
    //     subsets("", s, 0, list);
    //     Collections.sort(list); // METHOD OF SORT LIST , a , ab, abc, ac, b, bc, c
    //     System.out.println(list);      
    // }
    // public static void subsets(String ans, String s, int idx, List<String> list  ) {
    //     if (idx == s.length()) {
    //         if(ans.length()!=0)list.add(ans); // doest not print empty --> "" string 
    //         return;
    //     }
    //     char ch = s.charAt(idx);
    //     subsets(ans + ch, s, idx + 1, list); // pick ---> ya toh char string me add hoga
    //     subsets(ans, s, idx + 1, list); // skip -->char string me add nhi hoga 

    // }

    // GENERATE PARENTHESE ()(())
    // public void generate(int n, int left, int right, String s, List<String> ans) {      
    //     if (right == n) { // base case 
    //         ans.add(s);
    //         return;
    //     }
    //     if (left < n)generate(n, left + 1, right, s+ "(", ans); // firsrt add left bracket (
    //     if(right < n) generate(n, left, right+1, s + ")", ans);     // than right )
    // }
    // public List<String> generateParenthesis(int n ) { // starting point of question
    //     List<String> ans = new ArrayList<>(); // empty arr list create
    //     generate(n, 0, 0, "", ans); // left = 0 ,right =0, empty list = "" 
    //     return ans;
    // }

    // COUNT  AND SAY --> 1 , 11, 21, 1222
    // public String countAndSay(int n) {
    //     if (n == 1)
    //         return "1";
    //     String s = countAndSay(n - 1) + "#";
    //     String ans = "";
    //     int i = 0, j = 0;
    //     while (j < s.length()) {
    //         if (s.charAt(i) == s.charAt(j)) j++;
    //         else {
    //             int freq = j - i;
    //             ans += freq;
    //             ans += s.charAt(i);
    //             i = j;
    //         }
    //     }
    //     return ans;
    // }

    static int count;

    // public int towerOfHanoi(int a, int from, int to, int aux) {

    //     count = 0;
    //     hanoi(4, 'A', 'B', 'C');
    //     return count;
    // }

    // TOWER OF HANOI |||
    public static void main(String[] args) {
        hanoi(5, 'A', 'B', 'C');

    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 0)
            return;
        hanoi(n - 1, a, c, b);
        System.out.println(a + " -->" + c);// n -1 disks from A  to b via C
        // count++; // largest from  A to C
        hanoi(n - 1, b, a, c); // n -1 disks from b to c via A
    }
}
