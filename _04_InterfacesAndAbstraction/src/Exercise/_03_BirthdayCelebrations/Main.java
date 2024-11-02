package Exercise._03_BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Birthable> birthables = new ArrayList<>();

        String line = sc.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Citizen" -> {
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthdate = tokens[4];

                    Citizen citizen = new Citizen(name, age, id, birthdate);
                    birthables.add(citizen);
                }
                case "Pet" -> {
                    String name = tokens[1];
                    String birthdate = tokens[2];

                    Pet pet = new Pet(name, birthdate);
                    birthables.add(pet);
                }
            }

            line = sc.nextLine();
        }

        String year = sc.nextLine();

        birthables.stream()
                .filter(birthable -> birthable.getBirthDate().endsWith(year))
                .forEach(birthable -> System.out.println(birthable.getBirthDate()));
    }
}
