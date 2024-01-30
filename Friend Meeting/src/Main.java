import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, j, k, m;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        m = b - a;
        if (m % 2 == 0)
        {
            m = m / 2;
            System.out.println((m*(m + 1)));
        }
        else
        {
            m = a + b;
            k = m / 2;
            j = k - a;
            k = b - k;
            System.out.println(((j*(j + 1))/2 + (k*(k + 1))/2));
        }
    }
}