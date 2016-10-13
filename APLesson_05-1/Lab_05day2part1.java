import java.util.Scanner;

public class Lab_05day2part1
{
	static String Math;
	static String English;
	static String Writing;
	static String PE;
	static String SocialStudies;
	static String Science;
	static String Technology;
	static double GPA1;
	static double GPA2;
	static double GPA3;
	static double GPA4;
	static double GPA5;
	static double GPA6;
	static double GPA7;
	static double GPA;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Math grade:");
		Math = kb.next();
		GPA1= calcPoints(Math);
		
		
		System.out.println("Please enter your English grade:");
		English = kb.next();
		GPA2= calcPoints(English);
		
		
		System.out.println("Please enter your Writing grade:");
		Writing = kb.next();
		GPA3= calcPoints(Writing);
		
		System.out.println("Please enter your PE grade:");
		PE = kb.next();
		GPA4= calcPoints(PE);
		
		System.out.println("Please enter your Social Studies grade:");
		SocialStudies = kb.next();
		GPA5= calcPoints(SocialStudies);
		
		System.out.println("Please enter your Science grade:");
		Science = kb.next();
		GPA6= calcPoints(Science);
		
		System.out.println("Please enter your Technology grade:");
		Technology = kb.next();
		GPA7= calcPoints(Technology);
		
		GPA=((GPA1+GPA2+GPA3+GPA4+GPA5+GPA6+GPA7)/7);
		
		System.out.printf("Your GPA is " + GPA);
	}
	
	
	
	public static double calcPoints(String g)
	{
		if (g.equalsIgnoreCase("a")){
			return 4.0;
		}
		else if (g.equalsIgnoreCase("b")){
			return 3.0;
		}
		else if (g.equalsIgnoreCase("c")){
			return 2.0;
		}
		else if (g.equalsIgnoreCase("d")){
			return 1.0;
		} else {
			return 0;
		}
	}
}