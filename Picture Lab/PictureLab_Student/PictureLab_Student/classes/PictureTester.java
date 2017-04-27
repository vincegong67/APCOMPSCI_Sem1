/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("snowman.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testmirrorHorizontalBotToTop()
  {
	Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testmirrorHorizontal()
  {
	Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorHorizontal();
    temple.explore();
  }
 
  
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.Negate();
	  beach.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture beach = new Picture("seagull.jpg");
	  beach.explore();
	  beach.MirrorGull();
	  beach.explore();
  }
  
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.Grayscale();
	  beach.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("princehandsome.jpg");
    swan.edgeDetection2(5);
    swan.explore();
  }
   public static void testEdgeDetection3()
  {
    Picture swan = new Picture("princehandsome.jpg");
    swan.edgeDetection3(1);
    swan.explore();
  }
  
  public static void testCopyPart()
  {
	  Picture beach = new Picture("seagull.jpg");
	  beach.explore();
	  beach.copyPart(new Picture("swan.jpg"), 0, 0, 200, 200);
	  beach.explore();
  }
  
  public static void testmyCollage()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.zeroBlue();
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.Negate();
	  Picture beach = new Picture("beach.jpg");
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.mirrorHorizontalBotToTop();
	  beach.copyPart(swan, 200, 200, 400, 400);
	  beach.copyPart(seagull, 50, 50, 199, 125);
	  beach.copyPart(snowman, 0, 0, 75, 75);
	  beach.explore();
	    
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
	//testmirrorHorizontalBotToTop();
	//testmirrorHorizontal();
	//testMirrorVerticalRightToLeft();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testmyCollage();
	//testCopyPart();
    //testEdgeDetection();
    //testEdgeDetection2();
	testEdgeDetection3();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}