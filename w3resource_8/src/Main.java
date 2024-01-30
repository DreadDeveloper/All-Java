public class Main
{
	public static void main(String[] args)
	{
		int i;
		I iclass = new I();
		String sixStars = "* * * * * * ==================================";
		String fourStars = "  * * * *   ==================================";
		String noStars = "==============================================";
		for(i = 0; i < 9; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(fourStars);
			}
			else
			{
				System.out.println(sixStars);
			}
		}
		for(; i < 15; i++)
		{
			System.out.println(noStars);
		}
	}
}
class I
{
	int a;
}