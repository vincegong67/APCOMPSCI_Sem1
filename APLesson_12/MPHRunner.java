import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	System.out.println("What is the total distance?");
	int distance = kb.nextInt();
	System.out.println("What is the total hours?");
	int hours = kb.nextInt();
	System.out.println("What is the total minutes?");
	int minutes = kb.nextInt();

	MilesPerHour object = new MilesPerHour(distance, hours, minutes);
	
	System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes " + "= " + object.getMPH());
	
	System.out.println("What is the total distance?");
	distance = kb.nextInt();
	System.out.println("What is the total hours?");
	hours = kb.nextInt();
	System.out.println("What is the total minutes?");
	minutes = kb.nextInt();
	
	object.setDistance(distance);
	object.setHours(hours);
	object.setMinutes(minutes);
	
	System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes " + "= " + object.getMPH());
	}
}
