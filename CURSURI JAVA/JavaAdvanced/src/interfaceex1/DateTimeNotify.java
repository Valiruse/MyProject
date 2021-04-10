package interfaceex1;

import java.time.LocalDate;
import java.time.LocalTime;

public interface DateTimeNotify {

    void notifyClient(LocalDate date);

    void notifyClient(LocalTime time);

}
