package models;

import Exceptions.EmptyAttribute;

/**
 *
 * @author max
 */
public class Computer extends Device {

    String specs;

    public Computer(String name, String specs, boolean active) {
        super(name, active);
        this.specs = specs;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Override
    public void validateAttributes() throws EmptyAttribute {
        super.validateAttributes(); 
        if (this.specs.isEmpty()) throw new EmptyAttribute("Computador", "específicações");
    }
    
    
}
