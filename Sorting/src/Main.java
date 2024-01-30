import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		byte size, i;
		System.out.print("Enter the size of the array: ");
		size = scanner.nextByte();
		int[] arr = new int[size];
		System.out.println("Enter the array elements:-");
		for(i = 0; i < size; i++)
		{
			arr[i] = scanner.nextInt();
		}
		Sort sort = new Sort(size);
		sort.bubbleSort(arr);
	}
}