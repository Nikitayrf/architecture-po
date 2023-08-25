package homeworks.homework4.Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    private final int id;
    private final long cardNumber;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return this.cardNumber;
    }
}
