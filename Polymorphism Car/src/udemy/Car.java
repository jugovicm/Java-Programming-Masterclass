package udemy;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        String s = "Car -> startEngine()";
        return s;
    }

    public String accelerate(){
        String s = "Car -> accelerate()";
        return s;
    }

    public String brake(){
        String s = "Car -> brake()";
        return s;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
