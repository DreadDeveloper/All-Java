import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a three digit number(100 - 999): ");
		number = scanner.nextInt();
		ThreeDigitReverse rev = new ThreeDigitReverse(number);
		if(rev.isThreeDigit())
		{
			rev.reverse();
			rev.display();
		}
	}
}
