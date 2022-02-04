package Strings;
//Now this is really hard to understand through code
//https://www.geeksforgeeks.org/rabin-karp-algorithm-for-pattern-searching/
//Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[])
// that prints all occurrences of pat[] in txt[]. You may assume that n > m.
public class RabinKarp {
    // Rabin-Karp algorithm in Java
    public final static int d = 26; //number of unique characters in input

    static void search(String pattern, String txt, int q) {
        int m = pattern.length();
        int n = txt.length();
        int i, j;
        int p = 0;  //hash value for pattern
        int t = 0;  //hash value for text
        int h = 1;

        for (i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // Calculate hash value for pattern and text
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Find the match
        for (i = 0; i <= n - m; i++) {
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {
                    System.out.println("Pattern is found at position: " + (i + 1));
                }
            }

            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0) {
                    t = (t + q);
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt = "ABCCDDAEFG";
        String pattern = "CDD";
        int q = 13;  //any prime number
        search(pattern, txt, q);
    }
}
