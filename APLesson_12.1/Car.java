public class Car
{
	static String Paint, Interior, Engine, Tires;
	
	public Car(String p,String i,String e,String t)
	{
		Paint = p;
		Interior = i;
		Engine = e;
		Tires = t;
	}
	
	public void setCustom(String p,String i,String e,String t)
	{
		Paint = p;
		Interior = i;
		Engine = e;
		Tires = t;
	}
	
	public String getPaint()
	{
		return Paint;
	}
	
	public String getInterior()
	{
		return Interior;
	}
	
	public String getEngine()
	{
		return Engine;
	}
	
	public String getTires()
	{
		return Tires;
	}
}