public class PC extends GameSystem
{
	private String platform;
	private int serialNo;
	
	public PC()
	{
		super();
	}
	
	public PC(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return ("Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nSystem Input: " + systemInput());
	}
}