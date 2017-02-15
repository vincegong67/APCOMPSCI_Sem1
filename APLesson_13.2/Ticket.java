public abstract class Ticket
{
	private int serialNo;
	private double price;
	
	public Ticket()
	{
		this.serialNo = (int)(Math.random() * 9999999) + 1;
		this.price = 0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 9999999) + 1;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return ("Serial #: " + this.getSerialNo() + "\n Price : " + getPrice());
	}
}