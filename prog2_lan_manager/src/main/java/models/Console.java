package models;

import Exceptions.EmptyAttribute;

/**
 *
 * @author max
 */
public class Console extends Device {

    String model;

    public Console(String name, String model) {
        super(name);
        this.model = model;
    }

    public Console(int id, String name, String model, boolean available) {
        super(id, name, available);
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

    public String getModel() {
        return model;
    }
    
    public void setModel(String m) {
        this.model = m;
    }
    
} 
