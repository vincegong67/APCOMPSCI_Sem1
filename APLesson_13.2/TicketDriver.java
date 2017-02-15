public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup list = new Walkup();
		Advance list2 = new Advance(23);
		StudentAdvance list3 = new StudentAdvance(1);
	
		System.out.println("Walkup Ticket ");
		System.out.println(list);
		System.out.println("_________________________ \n");
		System.out.println("Advance Ticket");
		System.out.println(list2);
		System.out.println("_________________________ \n");
		System.out.println("Student Advance Ticket");
		System.out.println(list3);
	}
}