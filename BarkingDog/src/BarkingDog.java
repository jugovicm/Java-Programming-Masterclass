public class BarkingDog {
    public static boolean shouldWakeUp(boolean currentlyBarking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if (currentlyBarking == true && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
            return false;
    }
}
