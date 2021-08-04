import java.util.Random;

public class Poker2v {
    public static void main(String[] args) {
        String[] typeOfCards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suitOfCards = {"♠", "♣", "♥", "♦"};

        DeckOfCards deck = new DeckOfCards();
        Card[][] players = new Card[5][4];

        for (int i = 0; i < 13; i++) {
            for (int k = 0; k < 4; k++) {
                try {
                    Card l_cardItem = new Card(typeOfCards[i], suitOfCards[k]);
                    deck.addCard(l_cardItem);
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("Error:" + exception.getMessage());
                }
            }
        }

        deck.shuffle();

        for (int player = 0; player < 4; player++) {
            for (int i = 0; i < 5; i++) {
                try {
                    players[i][player] = deck.getNextCard();
                    System.out.println("Игрок " + player + " получает карту: " + players[i][player].getCard());
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("Error:" + exception.getMessage());
                }
            }
        }
    }
}
