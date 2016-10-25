import java.util.Scanner;
public class Lab_06part4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please Enter Your integer: ");
		Double integer =kb.nextDouble();
		
		System.out.println("Please Enter the Size of Your Table: ");
		Double Table = kb.nextDouble();
		
		System.out.println("X\t    ||Y");
		for(double i = 1; i <= Table; i++)
		{
		 double y = i*integer;
		 
		 System.out.printf(" %f||%f \n",i,y);
		}
	}
	
	
}