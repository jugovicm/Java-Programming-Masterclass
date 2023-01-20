public class Main {
    public static void main(String[] args){
        boolean res = BarkingDog.shouldWakeUp(true,21);
        System.out.println(res);
       res = BarkingDog.shouldWakeUp(true,4);
        System.out.println(res);
       res = BarkingDog.shouldWakeUp(false,21);
        System.out.println(res);
       res = BarkingDog.shouldWakeUp(true,24);
        System.out.println(res);
        res = BarkingDog.shouldWakeUp(false,1);
        System.out.println(res);

    }
}
