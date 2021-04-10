package interfaceex1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        DateTimeNotify notifyClient = new Client();

        notifyClient.notifyClient(LocalDate.now());
        notifyClient.notifyClient(LocalTime.now());
    }
}
