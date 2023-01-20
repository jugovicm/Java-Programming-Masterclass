public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int numTemp;
        numTemp = number;
        boolean negativeNum = false;
        if(number < 0){
            negativeNum = true;
            number = number * (-1);
        }
        while(number > 0){
            reverse += number % 10;
            reverse = reverse * 10;
            number = number / 10;
            //System.out.println(number);
            //System.out.println(reverse);
        }
        reverse = reverse / 10;
        //System.out.println(reverse);
        if (reverse == numTemp || reverse == -numTemp){
            System.out.println(numTemp + " is palindrome.");
            return true;
        }
        System.out.println(numTemp + " is not palindrome.");
        return false;
    }
}
