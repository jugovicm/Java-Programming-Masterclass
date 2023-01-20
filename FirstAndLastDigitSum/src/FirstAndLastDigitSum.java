public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
            int lastDig = number % 10;
            int firstDig = number;
            //System.out.println("l=" + lastDig);
            while (number > 0) {
                number = number / 10;
                if (number < 10 && number > 0) {
                    firstDig = number;
                    //System.out.println("f=" + firstDig);
                    break;
                }
            }
            System.out.println("Sum = " + lastDig + firstDig);
            return lastDig + firstDig;
    }
}
