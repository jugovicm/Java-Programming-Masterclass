public class SpeedCoverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        long milesPerHours = Math.round(kilometersPerHour/1.609);
        return milesPerHours;
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid value");
        }
        else {
            long milesPerHours = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHours + "mi/h");
        }
    }
}
