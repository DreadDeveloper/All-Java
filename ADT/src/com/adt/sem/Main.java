package com.adt.sem;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		Iterator iteratoral = arrayList.iterator();
		arrayList.add(15);
		System.out.println(arrayList.get(0));
		linkedList.add(25);
		System.out.println(linkedList.get(0));
		try
		{

		}catch (ArrayIndexOutOfBoundsException)
		{

		}finally {
			System.out.println("g");
		}
		if(arrayList.get(0) < 0)
		{
			throw new Exception("Niggative number");
		}
	}
}
