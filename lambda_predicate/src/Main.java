import java.util.Scanner;
import java.util.function.Predicate;
public class Main
{
	public static void main(String[] args)
	{
		Predicate<Integer> integerPredicate= i -> (i < 10);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = scanner.nextInt();
		if(integerPredicate.test(i))
		{
			System.out.println("The number is less than 10.");
		}
		else
		{
			System.out.println("The number is greater than 10.");
		}
	}
}