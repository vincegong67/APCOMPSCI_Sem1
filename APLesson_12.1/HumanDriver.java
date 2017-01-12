import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your Hair color?");
		String Hair = kb.nextLine();
		System.out.println("What is your Eye color?");
		String Eyes = kb.nextLine();
		System.out.println("What is your Skin color?");
		String Skin = kb.nextLine();
		
		Human object = new Human(Hair, Eyes, Skin);
		
		System.out.println("My info...");
		System.out.println("Hair: " + Hair);
		System.out.println("Eyes: " + Eyes);
		System.out.println("Skin: " + Skin);
		
		System.out.println("What is your Hair color?");
		Hair = kb.nextLine();
		System.out.println("What is your Eye color?");
		Eyes = kb.nextLine();
		System.out.println("What is your Skin color?");
		Skin = kb.nextLine();
		
		object.setHES(Hair, Eyes, Skin);
		
		System.out.println("My info...");
		System.out.println("Hair: " + Hair);
		System.out.println("Eyes: " + Eyes);
		System.out.println("Skin: " + Skin);
		
	}
}