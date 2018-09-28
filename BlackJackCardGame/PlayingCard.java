public class PlayingCard
{
	private int suit;
	private int value;
	private String suitAsString;
	private String valueAsString;
	private boolean isFaceUp;
	
	public PlayingCard(int suit, int value)
	{
		this.isFaceUp = true;
		this.suit = suit;
		if(value > 9)
			this.value = 9;
		else
			this.value = value;
		this.suitAsString = convertSuitToString(suit);
		this.valueAsString = convertValueToString(value);
	}
	
	public PlayingCard(PlayingCard card)
	{
		this.isFaceUp = card.isFaceUp;
		this.suit = card.suit;
		this.value = card.value;
		this.suitAsString = card.suitAsString;
		this.valueAsString = card.valueAsString;
	}
	
	public boolean getIsFaceUp()
	{
		return isFaceUp;
	}

	public void setIsFaceUp(boolean isFaceUp)
	{
		this.isFaceUp = isFaceUp;
	}
	
	public int getSuit()
	{
		return suit;
	}

	public int getValue()
	{
		return value;
	}

	public String getSuitAsString()
	{
		return suitAsString;
	}

	public String getValueAsString()
	{
		return valueAsString;
	}
	
	private String convertSuitToString(int suit)
	{
		String stringSuit = "";
		switch(suit)
		{
			case 0:
				stringSuit = "Spade";
				break;
			case 1:
				stringSuit = "Heart";
				break;
			case 2:
				stringSuit = "Diamond";
				break;
			case 3:
				stringSuit = "Club";
				break;
			default:
				stringSuit = "Not a valid suit";
				break;
		}
		return stringSuit;
	}
	
	private String convertValueToString(int value)
	{
		String stringValue = "";
		switch(value)
		{
			case 0:
				stringValue = "Ace";
				break;
			case 1:
				stringValue = "Two";
				break;
			case 2:
				stringValue = "Three";
				break;
			case 3:
				stringValue = "Four";
				break;
			case 4:
				stringValue = "Five";
				break;
			case 5:
				stringValue = "Six";
				break;
			case 6:
				stringValue = "Seven";
				break;
			case 7:
				stringValue = "Eight";
				break;
			case 8:
				stringValue = "Nine";
				break;
			case 9:
				stringValue = "Ten";
				break;
			case 10:
				stringValue = "Jack";
				break;
			case 11:
				stringValue = "Queen";
				break;
			case 12:
				stringValue = "King";
				break;
			default:
				stringValue = "Not a valid value";
				break;
		}
		return stringValue;
	}
	
	@Override
	public String toString()
	{
		return valueAsString + " " + suitAsString;
	}
}
