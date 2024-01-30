import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        printSubsets(3, arrayList);
    }

    public static void printSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            for (Integer integer : subset) {
                System.out.print(integer);
            }
            System.out.println();
            return;
        }
        subset.add(n);
        printSubsets(n - 1, subset);
        subset.remove(subset.size() - 1);
        printSubsets(n - 1, subset);
    }

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertPlace = placeTiles(n - m, m);
        int horiPlace = placeTiles(n - 1, m);
        return vertPlace + horiPlace;
    }

    public static int countPaths(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 || j == n - 1) {
            return 1;
        }
        int downPath = countPaths(i + 1, j, m, n);
        int rightPath = countPaths(i, j + 1, m, n);
        return downPath + rightPath;
    }

    public static void printPermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newString, permutation + currChar);
        }
    }
}