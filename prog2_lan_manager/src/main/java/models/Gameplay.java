package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    protected boolean playingNow;
    protected int id;

    public Gameplay(Customer customer, Game game, Device device, int timePlaying) {
        this.customer = customer;
        this.game = game;
        this.device = device;
        this.startDateTime = LocalDateTime.now();
        this.endDateTime = this.startDateTime.plusHours(timePlaying);
        this.playingNow = true;
    }
    
    public Gameplay(int id, Customer customer, Game game, Device device, LocalDateTime startDateTime,
            LocalDateTime endDateTime, int timePlaying, boolean playingNow) {
        this.id = id;
        this.customer = customer;
        this.game = game;
        this.device = device;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.playingNow = playingNow;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public boolean isBeingPlayed() {
        return this.playingNow;
    }

    public void setPlayingStatus(boolean status) {
        this.playingNow = false;
        this.device.setAvailableStatus(true);
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public String getFormatedEndDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return this.endDateTime.format(formatter);
    }

    public String getFormatedStartDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return this.startDateTime.format(formatter);
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

    public int getId() {
        return this.id;
    }

}
