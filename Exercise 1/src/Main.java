import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the friend's name: ");
		String name = scanner.nextLine();
		System.out.println("Hey " + name + ", it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!! ");
	}
}