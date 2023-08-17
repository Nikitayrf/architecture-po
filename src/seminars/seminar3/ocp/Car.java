package seminars.seminar3.ocp;

public class Car extends Vehicle {
    public Car(int maxSpeed, String type) {
        super( maxSpeed, type );
    }

    @Override
    public double calculateAllowed() {
        return super.maxSpeed * 0.8;
    }
}
