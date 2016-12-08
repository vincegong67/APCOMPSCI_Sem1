import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_10part2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = input.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));

		doEquation(equation);
	}
	
	public static void doEquation(ArrayList<String> equation)
	{	
		int i = 0;
		while(i < equation.size())
		{
			if(i < equation.size() && equation.get(i).equals("+"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
		
		System.out.println(equation);
	}
}