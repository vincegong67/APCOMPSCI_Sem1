import java.util.Scanner;
public class Lab_08part1
{
	static String sentence;
	
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a Sentence");
		System.out.println(replace(kb.nextLine()));
	}
	
	public static String replace(String sentence)
	{
		if (sentence.indexOf(" ")<0)
		{
			return sentence;
		}
		else
			return replace(sentence.substring(0,sentence.indexOf(" ")) +"_" + sentence.substring(sentence.indexOf(" ") + 1));
	}
	
}