import java.util.Scanner;
public class Lab_05day3part1
{
	static String yorn;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Answer Each One of These With a Y or N. There is a Monster ahead of you, Attack??");
		yorn= kb.next();
		if (yorn.equalsIgnoreCase("Y")){
			System.out.println("Wow you are very brave. Will you use a sword?");
			yorn=kb.next();
			if (yorn.equalsIgnoreCase("y")){
				System.out.println("Bad idea, your sword broke. Use your bare fists?");
				yorn=kb.next();
				if (yorn.equalsIgnoreCase("Y")){
					System.out.println("Going in with your bare hands will get you killed!");
					yorn=kb.next();
				}
				else
					System.out.println("With no weapon in your hand and no resolve to fight you have no choice but to die!");
				
			}
			else
				System.out.println("Would you rather use a bow instead?");
				yorn=kb.next();
				if (yorn.equalsIgnoreCase("Y")){
					System.out.println("What were you thinking using a puny bow versus a big monster! You are eaten alive!");
					yorn=kb.next();
				}
				else
					System.out.println("Refusing to use any weapons leaves you barehanded against an angry monster. You are torn apart limb by limb!");
				}
		else
			System.out.println("The Monster Charges at you Anyways. Stand your ground?");
			yorn=kb.next();
			if (yorn.equalsIgnoreCase("y")){
				System.out.println("Use the secret RPG that you have been concealing?");
				yorn=kb.next();
				if (yorn.equalsIgnoreCase("Y")){
					System.out.println("The explosion radius is so large that you destroy everything nearby.. including yourself");
					yorn=kb.next();
				}
				else
					System.out.println("The monster steals your RPG and bashes your miserable brains out!");
				
			}
			else
				System.out.println("The Monster is running after you. Do you want to turn left?");
				yorn=kb.next();
				if (yorn.equalsIgnoreCase("Y")){
					System.out.println("you run into a town and you and all the villager are consumed!");
					yorn=kb.next();
				}
				else
					System.out.println("You hit a dead end. The monster slowly walks towards you and rips your head off!");
	}
}






























