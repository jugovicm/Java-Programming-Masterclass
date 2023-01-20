public class AreaCalculator {
    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        System.out.println(radius * radius * Math.PI);
        return radius * radius * Math.PI;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        System.out.println(x*y);
        return x*y;
    }
}
