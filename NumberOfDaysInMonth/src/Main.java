public class Main {
    public static void main(String[] Args){
        NumberOfDaysInMonth.isLeapYear(-1600);
        NumberOfDaysInMonth.isLeapYear(1600);
        NumberOfDaysInMonth.isLeapYear(2017);
        NumberOfDaysInMonth.isLeapYear(2020);
        NumberOfDaysInMonth.getDaysInMonth(1,2020);
        NumberOfDaysInMonth.getDaysInMonth(2,2020);
        NumberOfDaysInMonth.getDaysInMonth(2,2018);
        NumberOfDaysInMonth.getDaysInMonth(-1,2020);
        NumberOfDaysInMonth.getDaysInMonth(1,-2020);

    }
}
