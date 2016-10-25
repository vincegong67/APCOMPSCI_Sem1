import java.util.Scanner;
public class Lab_06part3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please Enter Your Word: ");
		String Word =kb.next();
		
		for(int i = Word.length(); i >= 0; i--)
		{
			System.out.println(Word.substring(0,i));
		}
	}
}