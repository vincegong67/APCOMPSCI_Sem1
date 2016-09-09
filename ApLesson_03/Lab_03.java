import java.util.Scanner;

public class Lab_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hi, my name is Lance");
		System.out.println("Can I ask you a few dumb questions?");
		System.out.println("What is your name?");
		String answer1 = keyboard.next();
		System.out.println("Wow " + answer1 + " ,you are so much cooler than me");
		
		System.out.println("My name is so stupid, I should never have been born");
		System.out.println("How are your grades this year? What GPA are you going for");
		String answer2 = keyboard.next();
		System.out.println("Wow! a " + answer2 + "? Damn that's good!");
		
		System.out.println("My goal is a 1 because im so stupid.");
		System.out.println("Will you teach me how to be as cool as you?");
		String answer3 = keyboard.next();
		System.out.println("Dude! " + answer3 + " is such a mean answer, you are such a bad friend!");
		
		System.out.println("You are making me want to suicide");
		System.out.println("Should I?");
		String answer4 = keyboard.next();
		System.out.println("WOW! " + answer4 + "??? Fine i'll meet you in Hell.");
	
	}
}