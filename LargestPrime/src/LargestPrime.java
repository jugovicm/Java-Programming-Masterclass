public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number>0){
            int tmp = -1;
            for(int i = 2;i <= number;i++){
                if(number % i == 0){
                    number /= i;
                    tmp = i;
                    i--;
                }
            }
            return tmp;
        }
        return -1;
    }
}
