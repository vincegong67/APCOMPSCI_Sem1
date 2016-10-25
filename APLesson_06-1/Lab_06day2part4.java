public class Lab_06day2part4
{
	public static void main(String[]args)
	{
		repeat("Na",4);
		repeat("Na",4);
		repeat("Hey",3);
		repeat("Goodbye!",1);
	}
	
	public static void repeat(String Word,int times)
	{
	for(int i = 1; i <= times; i++)
		{
			System.out.print(Word+ " ");
		}
		System.out.println("");
	}
} 
