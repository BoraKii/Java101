package carClass;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 10, "red");
        audi.increaseSpeed(20);
        audi.printInfo();
        Car bmw = new Car();
    }
}