package Exercise._04_TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Signal[] signals = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Signal::valueOf)
                .toArray(Signal[]::new);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            Signal.updateSignal(signals);
            Signal.printSignals(signals);
        }
    }
}
