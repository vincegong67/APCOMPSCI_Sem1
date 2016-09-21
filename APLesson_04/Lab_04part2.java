import java.util.Scanner;

public class Lab_04part2
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String item1 = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter your title:");
		String item3= kb.nextLine();
		
		System.out.println("Enter the school site:");
		String item4= kb.nextLine();
		
		System.out.println("Enter the school year:");
		String item5= kb.nextLine();
		
		System.out.println("What is your subject?:");
		String item6= kb.nextLine();

		
		Lab_04part2 form = new Lab_04part2();
		System.out.println("************************************");
		form.format(item4,item5);
		form.format(item1,item2);
		form.format(item3,item6);
		System.out.println("************************************");
	
	}
	
	
	public void format (String word, String number)
	{
		System.out.printf("* %15s %16s *\n", word, number);
	}
}