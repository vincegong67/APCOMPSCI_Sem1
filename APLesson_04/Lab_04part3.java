import java.util.Scanner;

public class Lab_04part3
{
	public static void main(String[]args)
	{
		Lab_04part3 average = new Lab_04part3();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter Interest Rate:");
		double r = kb.nextDouble();
		System.out.println("Please enter Principal:");
		double p = kb.nextDouble();
		System.out.println("Please enter Number of Times Compounded:");
		double n = kb.nextDouble();
		System.out.println("Life of the Loan:");
		double t = kb.nextDouble();

		double payment = average.calcPay(r,p,n,t);
		System.out.printf("Your Monthly Payment is %6.2f\n" , payment);
	}
	
	public double calcPay(double r, double p, double n, double t)
	{
		//double exp= n*(t/12);
		//double x = r/n;
		//double y = 1 + x;
		//double z = Math.pow(y,exp);
		//double cost = z*p;
		//return cost;
		
		return (p*(Math.pow(1+(r/n), n*t)))/(t*12);
	}
}