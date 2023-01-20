public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long year = 0L;
            year = minutes / 525600;
            long day = 0L;
            long remMin = 0L;
            remMin = minutes % 525600;
            day = remMin / 1440;
            remMin = remMin % 1440;

            System.out.println(minutes + " min = " + year + " y and " + day + " d ");
        }
    }
}
