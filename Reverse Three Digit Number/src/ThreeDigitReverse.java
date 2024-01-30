public class ThreeDigitReverse
{
	private int number;
	private int reverse = 0;
	ThreeDigitReverse(int number)
	{
		this.number = number;
	}
	public void reverse()
	{
		while(number != 0)
		{
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
	}
	public void display()
	{
		System.out.println("The reverse of the given number is: " + reverse);
	}
	public boolean isThreeDigit()
	{
		return number >= 100 && number <= 999;
	}
}
