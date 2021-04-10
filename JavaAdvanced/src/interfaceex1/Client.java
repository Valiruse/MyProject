package interfaceex1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Client implements DateTimeNotify {

    @Override
    public void notifyClient(LocalDate date) {
        System.out.println(date);
    }

    @Override
    public void notifyClient(LocalTime time) {
        System.out.println(time);
    }
}
