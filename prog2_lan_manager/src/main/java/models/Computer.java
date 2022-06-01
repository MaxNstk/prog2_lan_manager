package models;

import java.util.List;

/**
 *
 * @author max
 */
public class Computer extends Device {

    String specs;

    public Computer(String name, String specs, boolean active, List<Game> availableGames) {
        super(name, active, availableGames);
        this.specs = specs;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {

        this.specs = specs;
    }
}
