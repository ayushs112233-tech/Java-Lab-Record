class Vehicle {

    void makeSound() {
        System.out.println("Vehicle makes a generic sound.");
    }
}

class MotorVehicle extends Vehicle {

    @Override
    void makeSound() {
        System.out.println("Motor vehicle engine is running.");
    }
}

class Car extends MotorVehicle {

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Car horn: Beep Beep!");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        vehicle.makeSound();

        // Runtime polymorphism causes the Car version of makeSound()
        // to execute even though the reference type is Vehicle.
    }
}