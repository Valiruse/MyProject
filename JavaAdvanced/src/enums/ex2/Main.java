package enums.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toUpperCase(Locale.ROOT);
        WeekDay weekDay = WeekDay.valueOf(day);
        weekDay.checkWeekStatus();
    }
}
