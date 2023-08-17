package homeworks.homework3;

import homeworks.homework3.task11.*;

import static homeworks.homework3.TypeBodyCar.*;
import static homeworks.homework3.TypeFuel.DISEL;
import static homeworks.homework3.TypeFuel.PETROL;
import static homeworks.homework3.TypeGearbox.AUTOMATIC;
import static homeworks.homework3.TypeGearbox.MECHANICAL;
import static java.awt.Color.*;

public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("LADA","GRANDA", BLACK, SEDAN, 4, PETROL, MECHANICAL, 1.5);
        passengerCar.move();

        SweepCar sweepCar = new SweepCar("VIHAR", "R-45", ORANGE,  SPECIAL, 4, DISEL, MECHANICAL, 4 );
        sweepCar.sweepStreets();

        Truck truck = new Truck( "GAZEL", "NEXT", WHITE, PICKUP, 4, DISEL, AUTOMATIC, 2.5 );
        truck.shipping();

        passengerCar.refuel();

        DieselCar dieselCar = new DieselCar( new Diesel() );
        dieselCar.refuel();

        PetrolCar petrolCar = new PetrolCar( new Petrol() );
        petrolCar.refuel();

    }
}
