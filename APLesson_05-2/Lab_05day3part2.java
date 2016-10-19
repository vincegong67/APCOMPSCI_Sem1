import java.util.Scanner;
public class Lab_05day3part2
{
	static String USER;
	static String PASS;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your username.");
		USER= kb.next();
		System.out.println("Please enter your password.");
		PASS= kb.next();
		
		check();
		
	}
		
		public static void check()
		{
		if (USER.equals("username")&& PASS.equals("password")){
			System.out.println("You are granted access!");
		}
		else if (!(USER.equals("username"))&& PASS.equals("password")){
			System.out.println("Your username is incorrect!");
		}
		else if (USER.equals("username")&& (!PASS.equals("password"))){
			System.out.println("Your password is incorrect");
			
			}
		else
			System.out.println("Your username and passwords is incorrect");
		}

}
