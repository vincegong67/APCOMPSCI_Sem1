import java.util.Scanner;
public class DistanceRunner
{
   public static void main(String[]args)
   {
	Scanner kb = new Scanner(System.in);
	System.out.println("What is your xOne value?");
	int x1 = kb.nextInt();
	System.out.println("What is your yOne value?");
	int y1 = kb.nextInt();
	System.out.println("What is your xTwo value?");
	int x2 = kb.nextInt();
	System.out.println("What is your yTwo value?");
	int y2 = kb.nextInt();

	Distance object = new Distance(x1, y1, x2, y2);
  
	System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and  (" + x2 + ", " + y2 + ") is " + object.getDist());
	
	System.out.println("What is your xOne value?");
	x1 = kb.nextInt();
	System.out.println("What is your yOne value?");
	y1 = kb.nextInt();
	System.out.println("What is your xTwo value?");
	x2 = kb.nextInt();
	System.out.println("What is your yTwo value?");
	y2 = kb.nextInt();
	
	object.setValues(x1, y1, x2, y2);
	
	System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and  (" + x2 + ", " + y2 + ") is " + object.getDist());
   }
}