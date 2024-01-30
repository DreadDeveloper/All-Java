package com.exp;
import java.lang.*;
class SquareRoot1 implements Runnable
{
	public void run()
	{
		int i;
		for(i = 1; i <= 15; i++)
		{
			System.out.println("Square Root of " + i + " is: " + Math.sqrt(i));
		}
	}
}
class SquareRoot2 implements Runnable
{
	public void run()
	{
		int i;
		for(i = 16; i <= 30; i++)
		{
			System.out.println("Square Root of " + i + " is: " + Math.sqrt(i));
		}
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Runnable sq1 = new SquareRoot1();
		Runnable sq2 = new SquareRoot2();
		Thread t1 = new Thread(sq1);
		Thread t2 = new Thread(sq2);
		t1.start();
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e){}
		t2.start();
	}
}
