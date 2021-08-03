import java.util.Random;

public class DeckOfCards {

    private Card [] cards;
    private int emptyPlace;
    private int currentCard;

    DeckOfCards()
    {
         cards = new Card[52];
         emptyPlace = 0;
         currentCard = 0;
    }

    void addCard(Card cardItem)
    {
        if(emptyPlace <= cards.length-1) {
            cards[emptyPlace] = cardItem;
            emptyPlace++;
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Not empty place in Deck");
        }
    }

    void shuffle()
    {
        Card currentCard;
        Random random = new Random();

        for(int i = 0; i <= 51; i++)
        {
            currentCard = cards[i];
            int randID = random.nextInt(51);
            cards[i] = cards[randID];
            cards[randID] = currentCard;
        }
    }

    Card getNextCard()
    {
        if (currentCard == 52){
            throw new ArrayIndexOutOfBoundsException("Last card in Deck");
        }
        return cards[currentCard++];
    }


}
