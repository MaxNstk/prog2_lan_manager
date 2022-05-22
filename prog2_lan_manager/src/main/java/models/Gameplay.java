package models;

/**
 *
 * @author max
 */
public class Gameplay {

    protected Customer customer;
    protected Game game;
    protected Device device;

    public Gameplay(Customer customer, Game game, Device device) {
        this.customer = customer;
        this.game = game;
        this.device = device;
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
