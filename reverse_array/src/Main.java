import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int i;
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int len = scanner.nextInt();
        for(i = 0; i < len; i++)
        {
            System.out.print("Enter the value: ");
            integerList.add(scanner.nextInt());
        }
        int[] arr = integerList.stream().mapToInt(n -> n).toArray();
        System.out.println("Given array:-");
        for(int a : arr)
        {
            System.out.print(a + " ");
        }
        for(i = 0; i < len / 2; i++)
        {
            arr[len - i - 1] = arr[len - i - 1] + arr[i];
            arr[i] = arr[len -i -1] - arr[i];
            arr[len - i - 1] = arr[len - i - 1] - arr[i];
        }
        System.out.println("\nReversed array:-");
        for(int a : arr)
        {
            System.out.print(a + " ");
        }
    }
}