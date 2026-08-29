import java.util.Arrays;

public class string {
    public int compress(char[] s) {
        int n = s.length, i = 0, write = 0;

        while (i < n) {
            int j = i;
            while (j < n && s[i] == s[j]) {
                j++;
            }

            s[write++] = s[i]; // Write the character

            int count = j - i;
            if (count > 1) {
                // Write each digit of count
                for (char c : Integer.String(count).toCharArray()) {
                    s[write++] = c;
                }
            }

            i = j;
        }

        return write; // Return new compressed length
    }
    public static void main(String[] args) {
        String s = "aabbzztkkaa";
        System.out.println(compress(s));
    }
}