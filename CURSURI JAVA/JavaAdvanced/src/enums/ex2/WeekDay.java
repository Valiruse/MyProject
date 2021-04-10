package enums.ex2;

public enum WeekDay {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekday() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return !isWeekday();
    }

    public  void checkWeekStatus() {
        if (isWeekday()) {
            System.out.println(" E timpul pentru munca");
        } else if (isHoliday()){
            System.out.println(" E timpul pentru relaxare.");
        }
    }


}
