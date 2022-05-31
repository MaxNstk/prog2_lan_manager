package models;

import java.time.LocalDateTime;

/**
 *
 * @author max
 */
public class Gameplay {

    protected Customer customer;
    protected Game game;
    protected Device device;
    protected LocalDateTime startDateTime;
    protected LocalDateTime endDateTime;


    public Gameplay(Customer customer, Game game, Device device,
        LocalDateTime startDateTime, LocalDateTime endDateTime){
        this.customer = customer;
        this.game = game;
        this.device = device;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

}
