public class Cake
{
	private String name;
	private float price;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public void display()
	{
		System.out.println(name + " : ₹" + price + " per pound");
	}
}
