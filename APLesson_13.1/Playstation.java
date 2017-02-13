public class Playstation extends Console
{
	private String platform;
	private int serialNo;
	
	public Playstation()
	{
		super();
	}
	
	public Playstation(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "Playstation";
	}
	
	
}