public class Main {
	public static void main(String[] args)
	{
		int a = 879;
		String b = String.valueOf(a);
		char temp = b.charAt(0);
		b.charAt(0) = b.charAt(2);
		System.out.println("Hello world!");
	}
}