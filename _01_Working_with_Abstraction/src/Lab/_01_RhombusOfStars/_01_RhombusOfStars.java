package Lab._01_RhombusOfStars;

import java.util.Scanner;

public class _01_RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 3
        int size = Integer.parseInt(scanner.nextLine());

        //  *
        // * *
        //* * *
        // * *
        //  *
        printRhombusOfStarts(size);
    }

    private static void printRhombusOfStarts(int size) {

        if (size == 1) {
            System.out.println("*");
            return;
        }

        // Upper part of the rhombus
        for (int row = 1; row <= size; row++) {
            printRowOfStars(row, size);
        }

        // Down part of the rhombus
        for (int row = size - 1; row >= 1; row--) {
            printRowOfStars(row, size);
        }

        System.out.println();
    }

    private static void printRowOfStars(int row, int size) {

        int countOfWhitespace = size - row;
        for (int i = 1; i <= countOfWhitespace; i++) {
            System.out.print(" ");
        }

        for (int star = 1; star <= row; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
