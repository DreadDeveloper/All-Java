import java.util.Scanner;
import java.util.function.Function;
public class Main
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> function1 = num -> num * num;
		Function<Integer, Integer> function2 = num -> num + num;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(function1.andThen(function2).apply(num)); // first function1 is calculated, then the result of function1 becomes the input of function2
		System.out.println(function1.compose(function2).apply(num)); // reverse of andThen()
	}
}