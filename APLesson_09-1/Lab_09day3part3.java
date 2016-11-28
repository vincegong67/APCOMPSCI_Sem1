import java.util.Scanner;
public class Lab_09day3part3
{
	public static String[]words;
	public static void main(String[]args)
	{
		words = new String[5];
		
		fillArray();
		
		System.out.print("For the words ");
		printArray();
		hasZs();
		System.out.print(" \n Only " + hasZs() + " contain(s) the letter z.");
		
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Put in 5 words:");
		for(int i= 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for(String word: words)
		{
			System.out.print(word + " ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for(String word: words)
		{
			if (word.indexOf("z") >=0){
				zs = zs + word + ",";
			}
		}
		return zs;
	}
}