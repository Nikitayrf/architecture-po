package homeworks.homework3;

import java.awt.*;

public class PassengerCar extends Car implements IRefuel, IWip {

    public PassengerCar(String brand, String model, Color color, TypeBodyCar bodyType, int numberWheels, TypeFuel fuelType, TypeGearbox gearbox, double valueEngine) {
        super( brand, model, color, bodyType, numberWheels, fuelType, gearbox, valueEngine );
    }

    @Override
    public TypeFuel getFuelType() {
        return super.getFuelType();
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + getFuelType() );
    }

    @Override
    public void cleanWindShield() {

    }

    @Override
    public void headlight() {

    }

    @Override
    public void wipMirror() {

    }
}
