import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args)
	{
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		//Using forEach()
		integerList.stream().map(n-> n + 10).forEach(System.out::println);
		//Using Collectors
		List<Integer> addedIntegerList = integerList.stream().map(n -> n + 25).collect(Collectors.toList());
		System.out.println(addedIntegerList);
	}
}