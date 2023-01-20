public class LastDigitChecker {
        public static boolean hasSameLastDigit(int first, int second, int third){
            if(!isValid(first) | !isValid(second) | !isValid(third)){
                return false;
            }
            if(first % 10 == second % 10 | first % 10 == third % 10 | third % 10 == second % 10){
               // System.out.println("true");
                return true;
            }
            //System.out.println("false");
            return false;
        }
        public static boolean isValid(int num){
            if(num < 10 | num > 1000){
                return false;
            }
            return true;
        }
}
