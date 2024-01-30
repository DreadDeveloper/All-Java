import java.util.Scanner;

public class Orchard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ashok = scanner.nextLine().toCharArray();
        char[] anand = scanner.nextLine().toCharArray();
        int possibilitiesAshok = countPossibleSelections(ashok, ashok.length);
        int possibilitiesAnand = countPossibleSelections(anand, anand.length);
        if (possibilitiesAshok == 0 && possibilitiesAnand == 0) {
            System.out.print("Invalid input");
        } else if (possibilitiesAshok > possibilitiesAnand) {
            System.out.print("Ashok");
        } else if (possibilitiesAshok < possibilitiesAnand) {
            System.out.print("Anand");
        } else {
            System.out.print("Draw");
        }
    }

    static int countPossibleSelections(char[] str, int size) {
        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            if (str[i] != str[i+1]) {
                count++;
            }
        }
        return count;
    }
}
