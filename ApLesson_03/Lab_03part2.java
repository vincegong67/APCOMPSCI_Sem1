import java.util.Scanner;

public class Lab_03part2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your Weight in Pounds?");
		double Weight = keyboard.nextDouble();
		
		System.out.println("What is your Height in Inches?");
		double Height = keyboard.nextDouble();
		
		double f = 0.45;
		double g = 0.025;
		double BMI = (Weight*f)/((Height*g)*(Height*g));
		
		System.out.println("Your BMI is " +BMI);
	}
	
}