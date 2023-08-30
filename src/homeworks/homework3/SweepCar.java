package homeworks.homework3;

import java.awt.*;

public class SweepCar extends Car{
    public SweepCar(String brand, String model, Color color, TypeBodyCar bodyType, int numberWheels, TypeFuel fuelType, TypeGearbox gearbox, double valueEngine) {
        super( brand, model, color, bodyType, numberWheels, fuelType, gearbox, valueEngine );
    }

    public void sweepStreets() {
        System.out.println("Cleaning street");
    }

}
