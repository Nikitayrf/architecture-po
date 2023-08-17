package seminars.seminar3.ocp;

public class Main {
    public static void main(String[] args) {
        Car car = new Car( 120, "Car" );
        System.out.println(car.calculateAllowed());
        Bus bus = new Bus( 90, "Bus" );
        System.out.println(bus.calculateAllowed());
    }
}
