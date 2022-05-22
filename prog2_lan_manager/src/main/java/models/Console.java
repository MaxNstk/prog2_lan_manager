package models;

import java.util.List;

/**
 *
 * @author max
 */
public class Console extends Device {

    String model;

    public Console(String model, boolean active, List<Game> availableGames) {
        super(active, availableGames);
        this.model = model;
    }
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

} 
