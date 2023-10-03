package carClass;

class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    // constructor
    Car(String model, int speed, String color) {
        this.type = "Sedan";
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.speedLimit = 180;
    }

    // overloading
    Car() {
        System.out.println("Boş kurucu metodu oluştu!");
    }

    // davranışlar
    int increaseSpeed(int increment) {
        if ((increment + this.speed) < this.speedLimit)
            this.speed += increment;
        return this.speed;
    }

    int decreaseSpeed(int decrease) {
        if (this.speed > 0)
            this.speed += decrease;
        return this.speed;
    }

    void printSpeed() {
        System.out.println(this.model + " Speed: " + this.speed);
    }

    void printInfo() {
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);
    }
}
