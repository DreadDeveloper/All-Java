import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n, i, j = 0, k = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print(0 + " " + 1 + " ");
        for(i = 2; i < n; i++)
        {
            System.out.print(j + k + " ");
            k = j + k;
            j = k - j;
        }
    }
}