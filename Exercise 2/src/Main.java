import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student1's marks: ");
		int a = scanner.nextInt();
		System.out.print("Enter student1's marks: ");
		int b = scanner.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Student1's marks: " + a + "\nStudent1's marks: " + b);
	}
}