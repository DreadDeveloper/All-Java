import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args)
	{
		List<Cake> cakeList = new ArrayList();
		Cake cake1 = new Cake();
		Cake cake2 = new Cake();
		cake1.setName("Chocolate Brownie");
		cake1.setPrice(250.0f);
		cake2.setName("Chocolate Maple");
		cake2.setPrice(300.0f);
		cakeList.add(cake1);
		cakeList.add(cake2);
		List<Pastry> pastryList = new ArrayList();
		Pastry pastry1 = new Pastry();
		Pastry pastry2 = new Pastry();
		pastry1.setName("Black Forest");
		pastry1.setPrice(35.0f);
		pastry2.setName("Choco Truffle");
		pastry2.setPrice(40.0f);
		pastryList.add(pastry1);
		pastryList.add(pastry2);
		System.out.println("\t\t\t   Today's Special Menu\n--------------------------------------------------");
		System.out.println("\nSpecial Cakes\n---------------------------------------------");
		for(Cake cake: cakeList)
		{
			cake.display();
		}
		System.out.println("\nSpecial Pastries\n---------------------------------------------");
		for(Pastry pastry: pastryList)
		{
			pastry.display();
		}
	}
}