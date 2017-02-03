import java.util.Scanner;

public class InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Inventory item1 = new Inventory();
		System.out.println("What is the Manufactor?");
		String Manufactor = kb.nextLine();
		System.out.println("What is the Item Name?");
		String ItemName = kb.nextLine();
		System.out.println("Will you be entering category and price information?");
		String info = kb.nextLine();
		
		if (info.equalsIgnoreCase("N"))
			{
				item1 = new Inventory(Manufactor, ItemName);
			}
		else
			{
				System.out.println("What is your Item category?");
				String ItemCategory = kb.nextLine();
				System.out.println("What is your item's price?");
				Double Price = kb.nextDouble();
				item1 = new Inventory(Manufactor, ItemName, ItemCategory, Price);
			}
			
		System.out.println(item1);
	}
}