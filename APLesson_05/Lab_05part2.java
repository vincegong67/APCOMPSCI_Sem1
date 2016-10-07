import java.util.Scanner;

public class Lab_05part2
{
	static String item1;
	static double item2;
	static String item3;
	static double item4;
	static String item5;
	static double item6;
	static String item7;
	static double item8;
	static boolean Price;
	
	static double tax;
	static double subtotal;
	static double total;
	static double percentoff;
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		 item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		 item2 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Please enter item 2:");
		 item3= kb.nextLine();
		System.out.println("Please enter the price:");
		 item4= kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Please enter item 3:");
		 item5= kb.nextLine();
		System.out.println("Please enter the price:");
		 item6= kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Please enter item 4:");
		 item7= kb.nextLine();
		System.out.println("Please enter the price:");
		 item8= kb.nextDouble();

		discount();
		tax=(0.08*subtotal);
		print();
	}
	
	public static void discount()
	{		
		subtotal = (item2 + item4 + item6+ item8);
		int limit = 2000;
		boolean Price = subtotal > limit;

		if (Price){
			total= ((subtotal * 0.85) * 1.08);
			percentoff= 15;
		}
		if (!Price){
			total= (subtotal*1.08);
			percentoff= 0;
		}
	}

	public static void print()
	{
		Lab_05part2 form = new Lab_05part2();
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1,item2);
		form.format(item3,item4);
		form.format(item5,item6);
		form.format(item7,item8);
		System.out.println("\n");
		form.format("Subtotal", subtotal);
		System.out.printf("* %15s ........ %10.2f", "Discount: ", percentoff);
		System.out.print("% *\n");
		form.format("Tax", tax);
		form.format("Total", total);
		System.out.println("\n__________________________________________");
		System.out.println("* Thank you for your support *");
		
	}
	
	
	public void format (String word, double number)
	{
		System.out.printf("* %15s ........ %11.2f *\n", word, number);
	}
	
}