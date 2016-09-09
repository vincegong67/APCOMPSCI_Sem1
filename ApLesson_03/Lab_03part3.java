import java.util.Scanner;

public class Lab_03part3
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your Mental Age?");
		double Mental_Age = keyboard.nextDouble();
		
		System.out.println("What is your Calendar Age?");
		double Calendar_Age = keyboard.nextDouble();
		
		double f = 100;
		double IQ = Mental_Age/Calendar_Age*f;
		
		System.out.println("Your IQ is " +IQ);
	}
	
}