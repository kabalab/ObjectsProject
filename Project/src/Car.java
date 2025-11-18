/**
 * Represents a car that has speed, color, model, wheel angle, and a driver.
 */
public class Car {

    int speed;
    String color;
    int wheelAngle;
    String model;
    Driver driver;
    boolean isRunning;

    /**
     * Creates a car with all fields specified.
     * @param speed the initial speed of the car
     * @param color the color of the car
     * @param wheelAngle the starting wheel angle
     * @param model the model name of the car
     * @param driver the driver operating the car
     * @param isRunning true if the car is currently running
     */
    public Car(int speed, String color, int wheelAngle, String model, Driver driver, boolean isRunning) {
        this.speed = speed;
        this.color = color;
        this.wheelAngle = wheelAngle;
        this.model = model;
        this.driver = driver;
        this.isRunning = isRunning;
    }

    /**
     * Creates a default car with preset values.
     */
    public Car() {
        this(0, "Red", 0, "Sedan", new Driver("Jahony", 18), false);
    }

    /**
     * Gets the current speed of the car.
     * @return the current speed
     */
    public int getSpeed() { return speed; }

    /**
     * Sets the speed of the car.
     * @param speed the new speed to set
     */
    public void setSpeed(int speed) { this.speed = speed; }

    /**
     * Gets the color of the car.
     * @return the color of the car
     */
    public String getColor() { return color; }

    /**
     * Sets the color of the car.
     * @param color the new color to apply
     */
    public void setColor(String color) { this.color = color; }

    /**
     * Gets the current wheel angle of the car.
     * @return the wheel angle
     */
    public int getWheelAngle() { return wheelAngle; }

    /**
     * Sets the wheel angle of the car.
     * @param wheelAngle the angle to set the wheels to
     */
    public void setWheelAngle(int wheelAngle) { this.wheelAngle = wheelAngle; }

    /**
     * Gets the model of the car.
     * @return the model name
     */
    public String getModel() { return model; }

    /**
     * Sets the model of the car.
     * @param model the new model name
     */
    public void setModel(String model) { this.model = model; }

    /**
     * Gets the driver of the car.
     * @return the driver object
     */
    public Driver getDriver() { return driver; }

    /**
     * Sets the driver of the car.
     * @param driver the driver to assign to the car
     */
    public void setDriver(Driver driver) { this.driver = driver; }

    /**
     * Checks if the car is running.
     * @return true if the car is running, false otherwise
     */
    public boolean isRunning() { return isRunning; }

    /**
     * Sets whether the car is running.
     * @param isRunning true if the car should be running
     */
    public void setRunning(boolean isRunning) { this.isRunning = isRunning; }

    /**
     * Stops the car by setting its speed to 0.
     */
    public void stop() {
        speed = 0;
    }

    /**
     * Accelerates the car by increasing its speed by 5.
     */
    public void accelerate() {
        speed += 5;
    }

    /**
     * Turns the car left by a specified number of degrees.
     * @param degrees the number of degrees to turn left
     */
    public void turnLeft(int degrees) {
        wheelAngle -= degrees;
        while (wheelAngle < 0) {
            wheelAngle += 360;
        }
    }

    /**
     * Turns the car right by a specified number of degrees.
     * @param degrees the number of degrees to turn right
     */
    public void turnRight(int degrees) {
        wheelAngle += degrees;
        while (wheelAngle > 360) {
            wheelAngle -= 360;
        }
    }

    /**
     * Provides a string describing the current state of the car.
     * @return a string representation of the car
     */
    @Override
    public String toString() {
        return "Car is a " + color + " " + model + " that is " +
                ((isRunning) ? "running with a speed of " + speed : "not running") +
                " with a wheel angle of " + wheelAngle + " and " + driver;
    }
}
