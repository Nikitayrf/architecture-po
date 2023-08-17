package seminars.seminar3.ocp;

public class Bus extends Vehicle {
    public Bus(int maxSpeed, String type) {
        super( maxSpeed, type );
    }

    @Override
    public double calculateAllowed() {
        return super.maxSpeed * 0.6;
    }
}
