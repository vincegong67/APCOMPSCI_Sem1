public class Lesson_02day2
{
	public static void main( String[] args )
	{
		int sum = add(5,5);
		print (sum);
	}
	
	public static int add (int one, int two)
	{
		return one + two;
	}
	
	public static void print(int s)
	{
		System.out.println("The sum of your numbers is "+ s);
	}
}