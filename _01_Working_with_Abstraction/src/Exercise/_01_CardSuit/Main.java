package Exercise._01_CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        System.out.println("Card Suits:");
        Arrays.stream(CardSuit.values())
                .forEach(System.out::println);
    }
}
