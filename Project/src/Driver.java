/**
 * Represents a driver with a name and age.
 */
public class Driver {

    String name;
    int age;

    /**
     * Creates a driver with the given name and age.
     * @param name the name of the driver
     * @param age the age of the driver
     */
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the driver.
     * @return the driver's name
     */
    public String getName() { return name; }

    /**
     * Sets the name of the driver.
     * @param name the new name for the driver
     */
    public void setName(String name) { this.name = name; }

    /**
     * Gets the age of the driver.
     * @return the driver's age
     */
    public int getAge() { return age; }

    /**
     * Sets the age of the driver.
     * @param age the new age to set
     */
    public void setAge(int age) { this.age = age; }

    /**
     * Returns a string describing the driver and legality of driving.
     * @return a string representation of the driver
     */
    @Override
    public String toString() {
        return "the drivers name is " + name + " and is driving " +
                ((age < 16) ? "illegally" : "legally") +
                " at the age of " + age;
    }
}
