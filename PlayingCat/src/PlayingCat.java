public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer == true){
            if(temperature >= 25 && temperature <= 45)
            {
                System.out.println("true");
                return true;
            }
            System.out.println("false");
            return false;
        }
        if(temperature >= 25 && temperature <= 35)
        {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
