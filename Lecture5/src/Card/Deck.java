package Card;

import java.util.ArrayList;

public class Deck {
    private static ArrayList<Card> cardList = new ArrayList<>();

    public static void main(String[] args) {
        generateCard();
        show();
    }

    private static void generateCard() {
        for (int i = 0; i < 52; i++) {
            int randomNum = (int) (Math.random() * 14);
            int randomMark = (int) (Math.random() * 4);
            cardList.add(new Card(randomNum, randomMark));
        }
    }

    public static void show() {
        int counter = 0;
        for (Card card : cardList) {
            System.out.println("Card No. " + counter);
            System.out.println("Mark: " + card.getMark() + " " + "Number: " + card.getNumber());
            System.out.println(card.getColor() + " " + card.toString());
            System.out.println();
            counter++;
        }
    }

}
