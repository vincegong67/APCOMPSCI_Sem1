public class GameRunner
{
	public static void main(String[]args)
	{
		XBox list = new XBox();
		PC list2 = new PC("Dell");
		Playstation list3 = new Playstation();
	
		
		System.out.println(list);
		System.out.println("\n" + list2);
		System.out.println("\n" + list3);
	}
}