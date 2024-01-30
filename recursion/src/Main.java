import java.util.HashSet;

public class Main {
    public static int first = -1, last = -1;

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        fibo(a, b, 8);
        HashSet<String> hashSet = new HashSet<>();
    }


    public static void fibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibo(b, c, n - 1);
    }

    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (str.length() == idx) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx + 1, newString + currChar, set);
        subsequences(str, idx + 1, newString, set);
    }

    public static void occ(String str, int idx, char ch) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(idx) == ch) {
            if (first == -1) {
                first = idx;
            }
            last = idx;
        }
        occ(str, idx + 1, ch);
    }

    public static void reverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverse(str, idx - 1);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return power(x, n / 2) * power(x, n / 2);
        } else {
            return power(x, n / 2) * power(x, n / 2) * x;
        }
    }
}