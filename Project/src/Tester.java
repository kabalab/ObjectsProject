public class Tester {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car(5, "Blue", 0, "Coupe", new Driver("Alice", 20), true);
        Car car2 = new Car();
        
        System.out.println(car1);
        System.out.println(car2);

        car1.accelerate();
        car1.turnRight(45);
        
    }
}
