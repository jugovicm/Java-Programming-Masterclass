public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            System.out.println("-1");
            return -1;
        }
        boolean leapYear = isLeapYear(year);
        int numOfDays = 0;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfDays = 31;
                break;
            case 2:
                if(leapYear == true) {
                    numOfDays = 29;
                }
                else {
                    numOfDays = 28;
                }
                break;
            default:
                numOfDays = 30;
                break;
        }
        System.out.println(numOfDays);
        return numOfDays;
    }
}
