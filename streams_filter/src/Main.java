import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args)
	{
		List<Integer> numbersList;
		numbersList = Arrays.asList(10, 11, 12, 13, 14, 15);
		//Using Collectors
		List<Integer> evenNumbersList = numbersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbersList);
		//Using forEach
		numbersList.stream().filter(n -> n % 2 == 0).forEach(System.out::println/*'n -> System.out.println' will also work.*/);
	}
}