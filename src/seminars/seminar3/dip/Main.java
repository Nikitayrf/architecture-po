package seminars.seminar3.dip;

public class Main {
    public static void main(String[] args) {
//        ElectroEngine en = new ElectroEngine();
//        Car car = new Car( (ElectroEngine ) en );
//        car.startEngine();
        Car car = new Car( new ElectroEngine() );
        car.startEngine();
    }
}
