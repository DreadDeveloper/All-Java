public class Main {
    public static void main(String[] args)
    {
        int i, j, n = 10;
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n) - 1; j++)
            {
                if(i + j >= n - 1 && i + j < (2 * n) - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}