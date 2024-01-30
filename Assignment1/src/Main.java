import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		String grp;
		System.out.println("-------------------------");
		System.out.print("Name: ");
		name = scanner.nextLine();
		System.out.print("Age: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Blood Group: ");
		grp = scanner.nextLine();
		System.out.println("-------------------------");
		if(age >= 20)
		{
			System.out.println("Your group is RED");
		}
		else if(age >= 15)
		{
			System.out.println("Your group is BLUE");
		}
		else if(age >= 10)
		{
			System.out.println("Your group is YELLOW");
		}
		System.out.println("-------------------------");
		scanner.close();
	}
}