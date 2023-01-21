package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Car car = new Car("Tata", 4, 4, 4, true, "Sedan");

        assert car.getName() == "Tata";

        assert car.getDoors() == 4;

        assert car.getGears() == 4;

        assert car.getWheels() == 4;

        assert car.isManual();

        assert car.getType() == "Sedan";

        assert car.getCurrentGear() == 1;

        car.changeSpeed(20, 30);

        assert car.getCurrentSpeed() == 20;

        assert car.getCurrentDirection() == 30;

        car.changeGear(3);

        assert car.getCurrentGear() == 3;

    }
}