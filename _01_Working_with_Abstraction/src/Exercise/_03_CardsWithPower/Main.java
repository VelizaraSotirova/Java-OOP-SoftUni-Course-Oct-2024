package Exercise._03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardRank = sc.nextLine();
        String cardSuit = sc.nextLine();

        CardRank cardRankEnum = CardRank.valueOf(cardRank);
        CardSuit cardSuitEnum = CardSuit.valueOf(cardSuit);

        Card card = new Card(cardRankEnum, cardSuitEnum);
        System.out.println(card);
    }
}
