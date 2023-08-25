package homeworks.homework4.Core;

import homeworks.homework4.Interfaces.ICustomer;
import homeworks.homework4.Models.Ticket;
import homeworks.homework4.Models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Класс, содержащий основную логику покупки билетов
 */
public class Customer implements ICustomer {
    private final TicketProvider ticketProvider;
    private final CashProvider cashProvider;
    private final UserProvider userProvider;
    private User client;
    private List<Ticket> selectedTickets;

    /**
     * Конструктор класса
     */
    public Customer() {
        this.cashProvider = new CashProvider();
        this.ticketProvider = new TicketProvider();
        this.userProvider = new UserProvider();
    }

    @Override
    public List<Ticket> getSelectedTickets() {
        return selectedTickets;
    }

    @Override
    public void setSelectedTickets(List<Ticket> selectedTickets) {
        this.selectedTickets = selectedTickets;
    }

    @Override
    public UserProvider getUserProvider() {
        return userProvider;
    }

    @Override
    public User getUser() {
        return client;
    }

    @Override
    public void setUser(User client) {
        this.client = client;
    }

    @Override
    public boolean buyTicket(Ticket ticket) throws RuntimeException {
        boolean flag;
        cashProvider.authorization( client );
        flag = cashProvider.buy( ticket );
        if (flag) {
            flag = ticketProvider.updateTicketStatus( ticket );
        }
        return flag;
    }

    @Override
    public List<Ticket> searchTicket(Date date, int route) throws RuntimeException {
        List<Ticket> result = new ArrayList<>();
        var list = ticketProvider.getTickets( route );
        for (Ticket ticket : list) {
            if (ticket.getDate().equals( date )) {
                result.add( ticket );
            }
        }
        if (result.isEmpty()) {
            throw new RuntimeException( "There are no tickets for this date" );
        }
        return result;
    }
}
