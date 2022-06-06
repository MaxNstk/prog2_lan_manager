package models;

import Exceptions.EmptyAttribute;

/**
 *
 * @author max
 */
public class Console extends Device {

    String model;

    public Console(String name, String model, boolean active) {
        super(name, active);
        this.model = model;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void validateAttributes() throws EmptyAttribute {
        super.validateAttributes(); 
        if (this.model.isEmpty()) new EmptyAttribute("Console", "Modelo");

    }
    
} 
