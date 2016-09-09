import java.util.Scanner;

public class Lab_03part2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your Weight?");
		double Weight = keyboard.nextDouble();
		
		System.out.println("What is your Height?");
		double Height = keyboard.nextDouble();
		
		double f = 703;
		double BMI = Weight * f/(Height * Height);
		
		System.out.println("Your BMI is " +BMI);
	}
	
}