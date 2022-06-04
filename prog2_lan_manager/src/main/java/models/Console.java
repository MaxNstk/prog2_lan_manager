package models;

import java.util.List;

/**
 *
 * @author max
 */
public class Console extends Device {

    String model;

    public Console(String name, boolean active) {
        super(name, active);
        this.model = model;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

} 
