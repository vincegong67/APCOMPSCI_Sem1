import java.util.Scanner;
public class Lab_09part1
{
	public static void main(String[]args)
	{
		String[] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("\nIn order ... ");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("\nReversed ... ");
		reverse(words);
	}
	public static void reverse(String[] w)
g	
	{
		for(int i = w.length; i > 0; i--){
			System.out.println(w[i-1]);
		}
	}
}