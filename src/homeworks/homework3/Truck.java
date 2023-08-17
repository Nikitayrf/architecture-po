package homeworks.homework3;

import java.awt.*;

public class Truck extends Car{
    public Truck(String brand, String model, Color color, TypeBodyCar bodyType, int numberWheels, TypeFuel fuelType, TypeGearbox gearbox, double valueEngine) {
        super( brand, model, color, bodyType, numberWheels, fuelType, gearbox, valueEngine );
    }
    public void shipping () {
        System.out.println("Truck shipping");
    }
}
