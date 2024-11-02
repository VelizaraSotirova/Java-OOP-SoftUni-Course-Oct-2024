package Exercise._01_ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());

        Box box = new Box(length, width, height);

        System.out.printf("Surface area - %.2f\n", box.calculateSurfaceArea());
        System.out.printf("Lateral Surface area - %.2f\n", box.calculateLateralSurfaceArea());
        System.out.printf("Volume - %.2f\n", box.calculateVolume());
    }
}
