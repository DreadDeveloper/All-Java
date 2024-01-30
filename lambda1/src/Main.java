interface Lamb
{
	void display();
}
interface Da
{
	void display(String firstName, String secondName);
}
/*class DisLamb implements Lamb
{
	public void display()
	{
		System.out.println("This is the interface.");
	}
}*/
public class Main
{
	public static void main(String[] args)
	{
		Lamb lamb = () -> System.out.println("This is the interface.");
		Da da = (firstName, secondName) -> System.out.println("This is "+ firstName + " " + secondName + ".");
		lamb.display();
		da.display("John", "Doe");
	}
}
