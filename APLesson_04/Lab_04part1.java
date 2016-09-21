import java.util.Scanner;

public class Lab_04part1
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double item2 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Please enter item 2:");
		String item3= kb.nextLine();
		System.out.println("Please enter the price:");
		double item4= kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Please enter item 3:");
		String item5= kb.nextLine();
		System.out.println("Please enter the price:");
		double item6= kb.nextDouble();
		
		double number= 0.075;
		double subtotal= (item2 + item4 + item6);
		double tax= (item2 +item4 +item6)* number;
		double total= (tax+subtotal);
		
		
		
		Lab_04part1 form = new Lab_04part1();
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1,item2);
		form.format(item3,item4);
		form.format(item5,item6);
		System.out.println("\n");
		form.format("Subtotal", subtotal);
		form.format("Tax", tax);
		form.format("Total", total);
		System.out.println("\n__________________________________________");
		System.out.println("* Thank you for your support *");
	
	}
	
	
	public void format (String word, double number)
	{
		System.out.printf("\n* %15s ........ %10.2f *", word, number);
	}
}