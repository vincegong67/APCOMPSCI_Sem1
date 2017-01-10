import java.lang.Math.*;
public class Distance
{
  static int xOne;
  static int yTwo;
  static int xTwo;
  static int yOne;
  static double distance;
  
  public Distance()
  {
	  xOne = 0;
	  yOne = 0;
	  xTwo = 0;
	  yTwo = 0;
	  distance = 0;
  }
  
  public Distance(int x1, int y1, int x2, int y2)
  {
	xOne = x1;
	yOne = y1;
	xTwo = x2;
	yTwo = x2;
	distance = 0;
  }
  
  public void setValues(int x1, int y1, int x2, int y2)
  {
	  xOne = x1;
	yOne = y1;
	xTwo = x2;
	yTwo = x2;
  }
  
  public double getDist()
  {
	  distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
	  return distance;
  }

}