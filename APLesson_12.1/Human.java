public class Human
{
	static String Hair, Eyes, Skin;
	
	public Human(String h,String e,String s)
	{
		Hair = h;
		Eyes = e;
		Skin = s;
	}
	
	public void setHES(String h,String e,String s)
	{
		Hair = h;
		Eyes = e;
		Skin = s;
	}
	
	public String getHair()
	{
		return Hair;
	}
	
	public String getEyes()
	{
		return Eyes;
	}
	
	public String getSkin()
	{
		return Skin;
	}
	
}