import java.util.Scanner;
public class Lab_06day2part1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please Enter Your Number: ");
		double number =kb.nextDouble();
		
		System.out.println("How Much do you Want to Count By?");
		double count = kb.nextDouble();
		
		for(int i = 0; i <= number; i += count)
		{
		System.out.print(i + "\t");
		}
	}
}