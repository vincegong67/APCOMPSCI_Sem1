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
		String[] r = new String[52];
        String[] s = new String[52];
        int[] p = new int[52];
        for (int i = 0; i < 52; i++) 
		{
            String rank = "";
            String suit = "";
			int p = 0;
			
            if ((i+1) % 13 == 11) 
			{
                rank = "Jack";
            }
            else if ((i+1) % 13 == 12) 
			{
                rank = "Queen";
            }
            else if ((i+1) % 13 == 0) 
			{
                rank = "King";
            }
            else if ((i+1) % 13 == 1) 
			{
                rank = "Ace";
            }
            else 
			{
                rank = Integer.toString((i + 1) % 13);
            }
            
            if (i < 13) 
			{
                suit = "Hearts";
            }
            else if (i < 26) 
			{
                suit = "Diamonds";
            }
            else if (i < 39) 
			{ 
                suit = "Clubs";
            }
            else 
			{
                suit = "Spades";
            }
            
            r[i] = rank;
            s[i] = suit;
            p[i] = ((i+1) % 13);
        }
        
        Deck d = new Deck(r, s, p);
        System.out.println(d);
    }
}
