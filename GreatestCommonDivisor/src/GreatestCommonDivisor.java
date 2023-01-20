public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int div,r;
        if(first>=10 && second>=10){
            while(first != 0){
                div =  second/first;
                r = second%first;
                second = first;
                first = r;
            }
            //System.out.println(second);
            return second;
        }
        return -1;
    }
}
