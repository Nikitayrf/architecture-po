package seminars.seminar3.dip;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void startEngine() {
        engine.start();
    }
}
