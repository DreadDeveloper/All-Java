import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.print("Enter the length: ");
		rec.length = scanner.nextFloat();
		System.out.print("Enter the breadth: ");
		rec.breadth = scanner.nextFloat();
		System.out.println("The area is: " + rec.area());
		System.out.println("The perimeter is: " + rec.perimeter());
	}
}