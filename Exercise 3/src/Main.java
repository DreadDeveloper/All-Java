public class Main
{
	public static void main(String[] args)
	{
		Puppy puppy = new Puppy();
		puppy.setName("Tom");
		puppy.setBreed("Labrador");
		puppy.setAge(3);
		System.out.println(puppy.getName() + '\n' + puppy.getBreed() + '\n' + puppy.getAge());
	}
}
class Animal
{
	private String name;
	public void run()
	{
		System.out.println("This animal runs!");
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("WOOF WOOF WOOF!!!");
	}
	private String breed;
	public String getBreed()
	{
		return breed;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
}
class Puppy extends Dog
{
	private int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}
