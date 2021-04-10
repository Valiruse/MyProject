package exceptions.exercise1;

import java.util.Scanner;

public class Input {

    public void readInput() {
        try(Scanner scanner = new Scanner(System.in) ) {

            String input = scanner.nextLine();
            try {
                int inputToint = Integer.parseInt(input);
                System.out.println("int -> " + inputToint);
            } catch (NumberFormatException e) {
                try {
                    double inputToDouble = Double.parseDouble(input);
                    System.out.println("Double ->" + inputToDouble);
                } catch (NumberFormatException e2) {
                    System.out.println("invalid value");
                }
            }
        }

    }
}
