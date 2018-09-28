import java.util.Random;

public class DeckOfCards
{
	private int deckPointer = 0;
	private PlayingCard[] deck;
	
	public DeckOfCards()
	{
		deck = new PlayingCard[52];
		createDeckOfCards();
		shuffleDeck(1000);
	}
	
	public DeckOfCards(DeckOfCards deckOfCards)
	{
		this.deck = new PlayingCard[52];
		for(int i = 0; i < deckOfCards.deck.length; i++)
		{
			this.deck[i] = deck[i];
		}
	}
	
	private void createDeckOfCards()
	{
		int cardCounter = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 13; j++)
			{
				deck[cardCounter] = new PlayingCard(i, j);
				cardCounter++;
			}
		}
	}
	
	public PlayingCard dealACard()
	{
		PlayingCard tempCard = null;
		if(deckPointer < 51)
			tempCard = deck[deckPointer++];
		return tempCard;
	}
	
	private void shuffleDeck(int numberOfTimes)
	{
		Random random = new Random();
		
		for(int i = 0; i < numberOfTimes; i++)
		{
			int index1 = random.nextInt(52);
			int index2 = random.nextInt(52);
			swap(index1, index2);
		}
		
	}
	
	public void swap(int one, int two)
	{
		PlayingCard a = deck[one];
		deck[one] = deck[two];
		deck[two] = a;
	}
	
	public String toString()
	{
		StringBuilder output = new StringBuilder();
		for(PlayingCard card : deck)
		{
			output.append(card.toString() + "\n");
		}
		return output.toString();
	}
}
