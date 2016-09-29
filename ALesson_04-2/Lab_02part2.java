import java.util.Scanner;
public class Lab_02part2
{
	static String var1= "The average of ";
	static String var2= " and ";
	static String var3= " is ";
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter number 1:");		
		num1 = kb.nextDouble();
		System.out.println("Please enter number 2:");		
		num2 = kb.nextDouble();
		System.out.println("Please enter number 3:");		
		num3 = kb.nextDouble();
		average();
		print();
	
	}
	
	public static void average()
	{
		avg= ((num1+num2+num3)/3);
	}

	public static void print()
	{
		System.out.println(var1 + num1 + " " + num2 + var2 + num3 + var3 + avg);
	}
}