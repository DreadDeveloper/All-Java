import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String c;
        int n2;
        System.out.print("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        do
        {
            System.out.print("Enter the operation: ");
            c = scanner.next();
            System.out.print("Enter the next number: ");
            n2 = scanner.nextInt();
            switch(c)
            {
                case "+": n1 = n1 + n2;
                break;
                case "-": n1 = n1 - n2;
                break;
                case "*": n1 = n1 * n2;
                break;
                case "/": n1 = n1 / n2;
                break;
                default:
                    System.out.println("You're gay.");
                    System.exit(0);
            }
            System.out.println("The result is: " + n1);
        }while(true);
    }
}