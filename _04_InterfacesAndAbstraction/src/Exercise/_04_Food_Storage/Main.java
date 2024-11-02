package Exercise._04_Food_Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] tokens = sc.nextLine().split("\\s+");

            if (tokens.length == 4) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                String birthdate = tokens[3];

                Citizen citizen = new Citizen(name, age, id, birthdate);
                citizens.add(citizen);
            } else {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String group = tokens[2];

                Rebel rebel = new Rebel(name, age, group);
                rebels.add(rebel);
            }
        }

        String name = sc.nextLine();
        while (!name.equals("End")) {

            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(name)) {
                    citizen.buyFood();
                }
            }
            for (Rebel rebel : rebels) {
                if (rebel.getName().equals(name)) {
                    rebel.buyFood();
                }
            }

            name = sc.nextLine();
        }

        int totalAmount = 0;
        for (Citizen citizen : citizens) {
            totalAmount += citizen.getFood();
        }
        for (Rebel rebel : rebels) {
            totalAmount += rebel.getFood();
        }

        System.out.println(totalAmount);
    }
}
