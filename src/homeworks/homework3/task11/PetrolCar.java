package homeworks.homework3.task11;

import homeworks.homework3.IRefuel;

public class PetrolCar implements IRefuel {
    public PetrolCar(Petrol petrol) {
        this.petrol = petrol;
    }

    private Petrol petrol;

    public Petrol getPetrol() {
        return petrol;
    }

    @Override
    public void refuel() {
        System.out.println("Refuel " + getPetrol().getClass().getSimpleName());
    }
}
