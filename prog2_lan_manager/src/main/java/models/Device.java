package models;

import java.util.List;

/**
 *
 * @author max
 */
public abstract class Device {

    protected boolean active;
    protected List<Game> availableGames;

    public Device(boolean active, List<Game> availableGames) {
        this.active = active;
        this.availableGames = availableGames;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Game> getAvailableGames() {
        return availableGames;
    }

    public void setAvailableGames(List<Game> availableGames) {
        this.availableGames = availableGames;
    }

}
