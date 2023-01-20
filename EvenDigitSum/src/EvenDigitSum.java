public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int tmpNum = number;
        int sum = 0;
        while (number != 0){
            //System.out.println(number);
            if ((number % 10) % 2 == 0){
                sum += number % 10;
            }
            number = number / 10;
        }
        System.out.println(sum);
        return sum;
    }
}
