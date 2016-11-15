import java.util.Scanner;
public class Lab_09part4
{
	static int start;
	static int size;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		start = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		size = kb.nextInt();
		
		int[] seq = new int[size];
		
		for(int i= 0; i < size; i++)
		{
			if (i==0 || i==1)
			{
				seq[i]= start;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.print(seq[i] + " ");

		}			
	}
}