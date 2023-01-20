public class SumOddRange {
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        if(number % 2 == 0){
            return false;
        }
        return true;
    }
    public static int sumOdd(int start, int end){
        if(start > end || start <= 0 || end <= 0)
        {
            System.out.println("-1");
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i) == true){
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
