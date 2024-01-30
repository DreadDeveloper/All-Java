import java.util.function.Consumer;
public class Main
{
	public static void main(String[] args)
	{
		Consumer<String> consumer1 = s -> System.out.println(s + " are a dumb dumb.");
		Consumer<String> consumer2 = s -> System.out.println(s + " are a retardo.");
		Consumer<String> consumer3 = s -> System.out.println(s + " are an idiota.");
		consumer1.andThen(consumer2).andThen(consumer3).accept("You");
		Consumer<String> consumer4 = consumer1.andThen(consumer2).andThen(consumer3);
		consumer4.accept("I");
	}
}