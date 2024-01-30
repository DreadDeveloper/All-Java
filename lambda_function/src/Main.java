import java.util.Scanner;
import java.util.function.Function;
public class Main
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> function = integer -> integer * integer;
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(function.apply(number));
	}
}