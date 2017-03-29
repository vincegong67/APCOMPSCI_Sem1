public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";

		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		if(statement.length() == 0)
		{
			System.out.println("Say something please.");
		}
		
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		 
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement, "robinette") >= 0)
		{
			response = "He sounds like a supa boosted teacher.";
		}

		// Responses which require transformations
		else if (findKeyword(statement, "i want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);
			
			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
				{
					response = transformYouMeStatement(statement);
				}
			else
				{
					response = getRandomResponse();
				}
		}
		return response;

	}

	
			/**
		* Take a statement with "I want to <something>." and transform it into
		* "What would it mean to <something>?"
		* @param statement the user statement, assumed to contain "I want to"
		* @return the transformed statement
		*/
		private String transformIWantToStatement(String statement)
		{
		   statement = statement.trim();
		   String lastChar = statement.substring(statement.length() - 1, statement.length());
		   if(lastChar.equals("."))
		   {
			    statement = statement.substring(0,statement.length()-1);
		   }
		   int psn = findKeyword(statement, "I want to");
		  String restOfStatement = statement.substring(psn+10, statement.length());
		  return "What would it mean to" + restOfStatement + "?";
		}


		/**
		* Take a statement with "you <something> me" and transform it into
		* "What makes you think that I <something> you?"
		* @param statement the user statement, assumed to contain "you" followed by "me"
		* @return the transformed statement
		*/
		private String transformYouMeStatement(String statement)
		{
		   statement = statement.trim();
		   String lastChar = statement.substring(statement.length() - 1, statement.length());
		   if(lastChar.equals("."))
		   {
			    statement = statement.substring(0,statement.length()-1);
		   }
		   int psnofYou = findKeyword(statement, "you");
		   int psnofMe = findKeyword(statement, "me", psnofYou+3);
		   String restOfStatement = statement.substring(psnofYou+3, psnofMe-1);
		   return "What makes you think that I " + restOfStatement + "you?";
		}
	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = " " + statement.toLowerCase().trim() + " ";
		int psn = phrase.indexOf(goal,startPos);
		
		while(psn >= 0)
		{
			String before = "";
			String after = "";
			if (psn > 0)
			{
				before =  phrase.substring(psn-1, psn);
			}
			if(psn+goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() +1);
			}
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			
			psn = phrase.indexOf(goal, psn + 1);
		}
 
		return -1;
	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
