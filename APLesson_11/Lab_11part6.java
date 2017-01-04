import java.util.Scanner;
public class Lab_11part6
{
	static int HEALTHLOAD = 6;
	static int healthCount;
	static String[]health;
	
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String [HEALTHLOAD];
		
		while(!(turn.equals("Q")) && healthCount > 0)
		{
			System.out.println("Your turn! Hit enter when ready: ");
			turn = kb.next().toLowerCase();
			damage = 1 + (int)(Math.random() * 2);
			amount = 1 + (int)(Math.random() * 6);
			
			System.out.println(takeDamage(damage,amount));
			printClip();
		}
		
		System.out.println("You died!!!");
	}
	
	
	public static int takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount = healthCount-amount;
			return "Taking [amount] damage";
		}
		else if(healthCount + amount < HEALTHLOAD)
		{
			healthCount = amount + healthCount;
		}
		else
		{
			healthCount=HEALTHLOAD;
		}
		return "Power up [amount] !";
	}
	
	public static void printClip()
	{
		String output = "Health \t";
		for(int i = 0; i < HEALTHLOAD;i++)
			if(i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[]";
				output += health[i];
			}
		
		System.out.println(output);
	}
}