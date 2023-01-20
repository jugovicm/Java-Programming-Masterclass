public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 | smallCount < 0 | goal < 0 ) {
            return false;
        }
        if(goal == ((bigCount)*5 + smallCount)){
            return true;
        }
        else if (goal <= ((bigCount)*5 + smallCount)){
            if (bigCount == 0){
                return true;
            }
            for(int i = 1; i <= bigCount; i++){
                if(goal == i*5){
                    return true;
                }
                for(int j=1;j<=smallCount;j++){
                    if(goal==((i*5)+(j*1))){
                        return true;
                    }
                }
            }
        }
            return false;
    }
}