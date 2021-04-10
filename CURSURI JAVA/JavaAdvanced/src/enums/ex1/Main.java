package enums.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Introduceti numele planetei: ");

        Scanner scanner = new Scanner(System.in);
        String planetName = scanner.nextLine().toUpperCase(Locale.ROOT);
        try {

            Planets planets = Planets.valueOf(planetName);
            System.out.println(planets);
            System.out.println("Distanta de la pamant la planeta este de: " + planets.distanceFromEarth());

        } catch (IllegalArgumentException e) {
            Planets.values();
            for (int i = 0; i < Planets.values().length; i++) {
                System.out.println(Planets.values()[i].name);
            }

        }


    }


}
