/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] r = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] s = new String[]{"Hearts", "Spades", "Diamonds", "Clubs"};
        int[] p = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        Deck d = new Deck(r, s, p);
        System.out.println(d);
    }
}
