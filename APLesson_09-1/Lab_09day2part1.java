public class Lab_09day2part1
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		numbers = fillArray(numbers);
		
		System.out.print("For the following numbers:: ");
		printArray(numbers);
		System.out.print("\nThese are the odd numbers:: ");
		getOdds(numbers);
	}
	
	public static int[] fillArray(int[] numbers)
	{
		for(int i= 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		return numbers;
	}
	
	public static void printArray(int[] numbers)
	{
		for(int number: numbers)
		{
			System.out.print(number + " ");
		}
	}
	
	public static void getOdds(int[] numbers)
	{
		
		for(int number: numbers)
		{
			if (number%2 == 1){
				System.out.print(number + " ");
			}
		}
	}
}