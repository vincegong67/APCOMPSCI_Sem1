import java.util.ArrayList;
import java.util.Scanner;

public class ToyStore
{
	public static void main(String[]args)
	{
		Arraylist<Toy> toyList = new ArrayList<Toy>();
	}
	
	public ToyStore()
	{
		loadToys()
	}
	
	public ToyStore(String t)
	{
		loadToys(t)
	}
	
	public String loadToys(String ts)
	{
		Arraylist<Toy> toys = new ArrayList<Toy>();
		toys = ts.split(", ")
		for(int i = 0; i < toys.size;i++)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy 
			//if the return is null
			//Add new toy - Car if type is “Car”, AFigure if type is “AF” 
			//Otherwise
			//The toy is already on the list, so set the count to +1. 

		}
	}
	
	public String getThatToy(String nm)
	{
		for(Toy x: toyList)
		{
			if(x.equals("nm");
				return x;
			else;
				return;
		}
	}
	
	public String getMostFrequentToy()
	{
		String name = ""
		int max = Integer.MIN_VALUE
		for(Toy x: toyList)
		{
			if(max < x.count;
				max = x.count;
				name = x.count;
				return name;
		}
	}
	
	public String getMostFrequentType()
	{
		int cars = 0
		int figure = 0
		for(Toy x:toyList)
		{
			if(type.equals("Car"))
				cars++;
			if(type.equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
		
	}
	
	public String toString()
	{
		return toyList
	}
}

