public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup list = new Walkup();
		Advance list2 = new Advance("Dell");
		StudentAdvance list3 = new StudentAdvance();
	
		
		System.out.println(list);
		System.out.println("\n" + list2);
		System.out.println("\n" + list3);
	}
}