import java.util.Scanner;

public class UserDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		User user1 = new User();
		System.out.println("What is your first name?");
		String firstName = kb.nextLine();
		System.out.println("What is your last name?");
		String lastName = kb.nextLine();
		System.out.println("Would you like to use a public avatar?");
		String avatar = kb.nextLine();
		
		if (avatar.equalsIgnoreCase("N"))
			{
				user1 = new User(firstName, lastName);
			}
		else
			{
				System.out.println("What is your avatar called?");
				String av = kb.nextLine();
				user1 = new User(firstName, lastName, avatar);
			}
			
		System.out.println(user1);
	}
}