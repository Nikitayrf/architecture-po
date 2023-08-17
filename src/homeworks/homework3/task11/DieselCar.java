package homeworks.homework3.task11;

import homeworks.homework3.IRefuel;

public class DieselCar implements IRefuel {
    private Diesel fuel;

    public DieselCar(Diesel fuel) {
        this.fuel = fuel;
    }

    public Diesel getFuel() {
        return fuel;
    }

    @Override
    public void refuel() {
        System.out.println("Refuel " + getFuel().getClass().getSimpleName());
    }
}
