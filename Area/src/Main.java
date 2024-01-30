import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Area area = new Area();
		double a, b, c;
		System.out.println("Enter the shape(Square, Rectangle, Circle, Triangle:-)");
		String shape = scanner.nextLine();
		switch (shape)
		{
			case "Square":
				System.out.print("Enter the length of the side: ");
				a = scanner.nextDouble();
				System.out.println("The area is: " + area.squareArea(a));
				break;
			case "Rectangle":
				System.out.print("Enter the length: ");
				a = scanner.nextDouble();
				System.out.print("Enter the breadth: ");
				b = scanner.nextDouble();
				System.out.println("The area is: " + area.rectangleArea(a, b));
				break;
			case "Circle":
				System.out.print("Enter the radius: ");
				a = scanner.nextDouble();
				System.out.println("The area is: " + area.circleArea(a));
				break;
			case "Triangle":
				System.out.print("Enter the length of the side1: ");
				a = scanner.nextDouble();
				System.out.print("Enter the length of the side2: ");
				b = scanner.nextDouble();
				System.out.print("Enter the length of the side3: ");
				c = scanner.nextDouble();
				System.out.println("The area is: " + area.triangleArea(a, b, c));
				break;
		}
	}
}