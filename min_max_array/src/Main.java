import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        for(int i = 0; i < length; i++)
        {
            System.out.print("Enter the value: ");
            arr.add(scanner.nextInt());
        }
        arr.sort(Comparator.naturalOrder());
        System.out.println("The minimum integer is: " + arr.get(0) +
                "\nThe maximum integer is: " + arr.get(arr.size() - 1));
        int x = 10;
        System.out.println(x/3);
    }
}