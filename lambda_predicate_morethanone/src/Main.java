import java.util.function.Predicate;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		Predicate<String> stringPredicate = s -> (s.length() > 5 && s.length() < 10);
		String[] names = {"John", "Tucker", "Eli", "McNasty", "Soviet Womble", "James May", "Niel Armstrong"};
		for(String s: names)
		{
			if(stringPredicate.test(s))
			{
				System.out.println(s);
			}
		}
	}
}