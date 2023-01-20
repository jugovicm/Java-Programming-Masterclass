public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        else{
            int sum = 0;
            int n = 1;
            while (n < number){
                if(number % n == 0){
                    sum += n;
                }
                n++;
            }
            if (sum == number){
                return true;
            }
            return false;
        }
    }
}
