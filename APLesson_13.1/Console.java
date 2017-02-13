public class Console extends GameSystem
{
	private String platform;
	private int serialNo;
	
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "";
	}
	
	public String toString()
	{
		return ("Platform: " + this.getPlatform() + "\nSerial #: " + this.getSerialNo() + "\nController: " + this.getController());
	}
}