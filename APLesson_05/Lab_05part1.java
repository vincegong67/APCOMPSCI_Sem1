import java.util.Random;
public class Lab_05part1
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		
		int Player = rand.nextInt(7);
		int Computer = rand.nextInt(7);
		
		System.out.println("You rolled a " + Player);
		System.out.println("Computer rolled a " + Computer);	
		
		boolean compare = Player > Computer;
		
		if (compare)
			System.out.println("Player is the winner");
		if (!compare)
			System.out.println("Computer is the winner");
		}
	}