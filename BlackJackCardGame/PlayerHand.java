import java.util.ArrayList;

public class PlayerHand
{
	ArrayList<PlayingCard> hand;
	
	public PlayerHand()
	{
		hand = new ArrayList<>();
	}
	
	public PlayerHand(PlayerHand playerHand)
	{
		hand = new ArrayList<PlayingCard>();
		for(PlayingCard card : playerHand.hand)
		{
			hand.add(card);
		}
	}
	
	public void addACardToHand(PlayingCard card, boolean isFaceUp)
	{
		card.setIsFaceUp(isFaceUp);
		hand.add(card);
	}
				
	public int calculateHandValue()
	{
		int value = 0;
		int numberOfAces = 0;
		for(PlayingCard card : hand)
		{
			int tempValue = card.getValue() + 1;
			if(tempValue == 1)
			{
				tempValue = 11;
				numberOfAces++;
			}
			value += tempValue;
		}
		if(value > 21)
		{
			if(numberOfAces > 0)
			{
				for(int j = 0; j < numberOfAces; j++)
				{
					value = value - 10;
					if(value <= 21)
					{
						break;
					}
				}
			}
		}
		return value;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		//output all cards in hand. If one if face down 
		//then do not print that cards suit or value, 
		//instead print ******
		return sb.toString();
	}

}
