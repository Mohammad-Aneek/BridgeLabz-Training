public class DeckOfCards {
    // to generate deck
    public String[] getDeck() {
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (int outerCounter = 0; outerCounter < suits.length; outerCounter++) {
            for (int innerLoop = 0; innerLoop < ranks.length; innerLoop++) {
                deck[index] = ranks[innerLoop] + " of " + suits[outerCounter];
                index++;
            }
        }

        return deck;
    }

    // to shuffle Deck
    public String[] shuffleDeck(String[] deck) {
        for (int counter = 0; counter < deck.length; counter++) {
            int index = counter + (int)(Math.random() * (deck.length - counter));
            String temp = deck[counter];
            deck[counter] = deck[index];
            deck[index] = temp;
        }
        return deck;
    }

    // to distribute deck evenly
    public String[][] distribute(String[] deck, int x) {
        if (52%x!=0) {
            return null;
        }
        String[][] distributedDeck = new String[x][52/x];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 52/x; j++) {
                distributedDeck[i][j] = deck[index];
                index++;
            }
        }
        return distributedDeck;
    }
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        String[] deck = deckOfCards.getDeck();
        deck = deckOfCards.shuffleDeck(deck);
        int players = 4;

        String[][] hands = deckOfCards.distribute(deck, players);
        if (hands == null) {
            System.out.println("Cannot distribute cards evenly.");
            return;
        }

        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < hands[i].length; j++) {
                System.out.println("  " + hands[i][j]);
            }
            System.out.println();
        }
    }
}
