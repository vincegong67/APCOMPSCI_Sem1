/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] ranks = {"jack", "queen", "king"};
		int[] pointValues = {11, 12, 13};
		String[] suits = {"hearts", "diamonds"};
		Deck d = new Deck(ranks, suits, pointValues);
		
		System.out.println(d);
		d.deal();
		System.out.println(d);
		d.deal();
		System.out.println(d);
		d.deal();
		
	}
}
