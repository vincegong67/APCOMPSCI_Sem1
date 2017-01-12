import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your Paint color?");
		String Paint = kb.nextLine();
		System.out.println("What is your Interior design?");
		String Interior = kb.nextLine();
		System.out.println("What is your Engine type?");
		String Engine = kb.nextLine();
		System.out.println("What is your Tire size?");
		String Tires = kb.nextLine();
		
		Car object = new Car(Paint, Interior, Engine, Tires);
		
		System.out.println("Your vehicle is ready ......");
		System.out.println("Paint: \t" + Paint);
		System.out.println("Interior: \t" + Interior);
		System.out.println("Engine: \t" + Engine);
		System.out.println("Tires: \t" + Tires);
		
		System.out.println("What is your Paint color?");
		Paint = kb.nextLine();
		System.out.println("What is your Interior design?");
		Interior = kb.nextLine();
		System.out.println("What is your Engine type?");
		Engine = kb.nextLine();
		System.out.println("What is your Tire size?");
		Tires = kb.nextLine();
		
		object.setCustom(Paint, Interior, Engine, Tires);
		
		System.out.println("Your vehicle is ready ......");
		System.out.println("Paint: \t" + Paint);
		System.out.println("Interior: \t" + Interior);
		System.out.println("Engine: \t" + Engine);
		System.out.println("Tires: \t" + Tires);
		
	}
}