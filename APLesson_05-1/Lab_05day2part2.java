import java.util.Scanner;

public class Lab_05day2part2
{
	static double Weight;
	static double Height;
	static double BMI;
	static double f;
	static double g;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your Weight in Pounds?");
		Weight = keyboard.nextDouble();
		
		System.out.println("What is your Height in Inches?");
		Height = keyboard.nextDouble();
		f = 0.45;
		g = 0.025;
		BMI = (Weight*f)/((Height*g)*(Height*g));
		
		calcBMI();
		
		System.out.println("Your BMI is " +BMI);
		System.out.println("Your condition is " + condition);
	}
	
	public static void calcBMI()
	{
	
		
		if(BMI > 39.9){
		condition= "Morbidly Obese";
		}
		else if(BMI > 35){
		condition= "Very Obese";
		}
		else if(BMI > 29.9){
		condition= "Obese";
		}
		else if(BMI > 25){
		condition= "Overweight";
		}
		else if(BMI > 18.3){
		condition= "Normal";
		}
		else{
		condition= "Underweight";
		}
	}
}