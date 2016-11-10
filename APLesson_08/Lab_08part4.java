import java.util.Scanner;
public class Lab_08part4
{
	static String word;
	static int stop;
	static int start = 0;
	
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a Word");
		word = kb.nextLine();
		stop = word.length();
		tree(word,stop,start);
	}
	
	public static void tree(String word, int stop, int start)
	{
		if (start <= stop)
		{
			System.out.printf("%10s\n",word.substring(0,start));
			start++;
			tree(word,stop,start);
		}
		
	}
	
}