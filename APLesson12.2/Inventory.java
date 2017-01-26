public class Inventory
{
   private String Manufactor;
   private String ItemName;
   private String ItemCategory;
   private int UPC;
   private double Price;
   
   public Inventory()
   {
	   Manufactor = "";
	   ItemName = "";
	   ItemCategory = "";
	   UPC = 0;
	   Price = 0;
   }
	
   public Inventory(String Manu, String Item)
   {
		Manufactor = Manu;
		ItemName = Item;
		UPC = (int)(Math.random() * 1000000) + 1;
		ItemCategory = "Not Available";
		Price = 0;
	}
	
	 public Inventory(String Manu, String Item, String Category, double Pr)
   {
		Manufactor = Manu;
		ItemName = Item;
		UPC = (int)(Math.random() * 1000000) + 1;
		ItemCategory = Category;
		Price = Pr;
	}
	
	public String toString()
	{
		return "Item Info...\nManufactor: " + Manufactor +
                           "\nItem Name: " + ItemName +
                           "\n Item Category: " + ItemCategory +
                           "\n UPC ID#: " + UPC +
						   "\n Price: " + Price;
	}
}