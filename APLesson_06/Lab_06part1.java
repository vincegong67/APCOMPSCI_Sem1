import java.util.Scanner;
public class Lab_06part1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please Enter Your Word: ");
		String Word =kb.next();
		
		for(int i = 1; i <= Word.length(); i++)
		{
			System.out.println(Word);
		}
	}
}