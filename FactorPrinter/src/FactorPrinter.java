public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        else{
            int n = 1;
            while(n <= number){
                if(number % n == 0){
                    System.out.print(" " + n + "");
                }
                n++;
            }
        }
    }
}
