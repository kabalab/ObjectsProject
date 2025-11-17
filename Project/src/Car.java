public class Car {
    //     At least 6 instance variables
// One of these must be an object from a class you create (your secondary class).
// Overloaded constructors (at least 2 different ways to create your object)
// Accessor (getter) and mutator (setter) methods for each instance variable
// At least 4 behavior methods
// 2 methods with parameters
// 2 methods without parameters
// A toString() method to describe your object
    
    int speed;
    String color;
    int wheelAngle;
    String model;
    Driver driver;
    boolean isRunning;


    public Car(int speed, String color, int wheelAngle, String model, Driver driver, boolean isRunning) {
        this.speed = speed;
        this.color = color;
        this.wheelAngle = wheelAngle;
        this.model = model;
        this.driver = driver;
        this.isRunning = isRunning;
    }

    public Car() {this(0, "Red", 0, "Sedan", new Driver(), false);}

    public void stop(){
        speed = 0;
    }
    
    public void accelerate(){
        speed += 5;
    }

    public void turnLeft(int degrees){
        wheelAngle -= degrees;
        while (wheelAngle < 0){
            wheelAngle += 360;
        }
    }

    public void turnRight(int degrees){
        wheelAngle += degrees;
        while (wheelAngle > 360){
            wheelAngle -= 360;
        }
    }

    @Override
    public String toString(){
        return "Car is a " + color + " " + model + " that is " + ((isRunning) ? "running" : "not running") + " with a wheel angle of " + wheelAngle + " and " + driver; 
    }

    public static void main(String[] args) {
        System.out.println("Car started.");
    }
}