package homeworks.homework4.Interfaces;

import homeworks.homework4.Models.Ticket;

import java.util.List;

/**
 * Интерфейс взаимодействия с базой билетов
 */
public interface ITicketRepo {
    /**
     * Создать новый билет
     */
    boolean create(Ticket ticket);

    /**
     * Получить список билетов по номеру маршрута
     */
    List<Ticket> readAll(int routeNumber);

    /**
     * Обновить билет
     */
    boolean update(Ticket ticket);

    /**
     * Удалить билет
     */
    boolean delete(Ticket ticket);
}
