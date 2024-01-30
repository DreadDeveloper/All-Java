import java.lang.Math;
public class Area
{
	public double squareArea(double side)
	{
		return (side * side);
	}
	public double rectangleArea(double length, double breadth)
	{
		return (length * breadth);
	}
	public double circleArea(double radius)
	{
		return (3.14 * radius * radius);
	}
	public double triangleArea(double a, double b, double c)
	{
		double s = ((a + b + c) / 2);
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
