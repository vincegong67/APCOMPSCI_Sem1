public class XBox extends Console
{
	private String platform;
	private int serialNo;
	
	public XBox()
	{
		super();
	}
	
	public XBox(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String getPlatform()
	{
		return "XBox";
	}
	
	
}