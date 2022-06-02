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
    protected boolean playingNow;


    public Gameplay(Customer customer, Game game, Device device, int timePlaying){
        this.customer = customer;
        this.game = game;
        this.device = device;
        this.startDateTime = LocalDateTime.now();
        this.endDateTime = this.startDateTime.plusHours(timePlaying);
        this.playingNow = true;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }
    
    public boolean isBeingPlayed(){
        return this.playingNow;
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
