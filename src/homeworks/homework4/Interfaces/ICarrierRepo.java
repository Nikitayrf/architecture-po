package homeworks.homework4.Interfaces;


import homeworks.homework4.Models.Carrier;

/**
 * Интерфейс взаимодействия с базой перевозчиков
 */
public interface ICarrierRepo {
    /**
     * Получить модель перевозчика из базы по ID
     *
     * @param id идентификатор перевозчика в базе
     */
    Carrier read(int id);
}
