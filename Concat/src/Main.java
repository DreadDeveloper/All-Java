import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		String s1, s2;
		Scanner scanner = new Scanner(System.in);
		s1 = scanner.nextLine();
		s2 = scanner.nextLine();
		s1 = s1.concat(s2);
		Concatination concatination = new Concatination();
		concatination.display(s1);
	}
}