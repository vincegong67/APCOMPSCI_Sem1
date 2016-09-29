import java.util.Scanner;
public class Lab_02part1
{
	static String var1= "Your rectangle is ";
	static String var2= "ft around.";
	static double var3;
	static double var4;
	static double p;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length:");		
		var3 = kb.nextDouble();
		System.out.println("Please enter the width:");	
		var4 = kb.nextDouble();
		calcPerim();
	
	}
	
	public static void calcPerim()
	{
		p=((var4+var4)+(var3+var3));
		System.out.println(var1+ p + var2);
	}
}