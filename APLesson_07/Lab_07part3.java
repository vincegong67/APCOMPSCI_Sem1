import java.util.Scanner;
public class Lab_07part3
{
	static int number;
	static int rev;
	
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		number= kb.nextInt();
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	
	public static void getReverse()
	{
		rev = 0;
		int num = number;
		while(num>0)
		{
			rev*=10;
			rev = rev + (num % 10);
			num /= 10;
		}
	}
	
}