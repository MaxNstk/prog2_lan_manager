package models;

import Exceptions.EmptyAttribute;

/**
 *
 * @author max
 */
public abstract class Device {

    protected boolean available;
    protected int id;
    protected String name;

    public Device(String name) {
        this.name = name;
        this.available = true;
    }
    
    public Device(int id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return this.available;
    }
    
    public void setAvailableStatus(boolean status){
        this.available = status;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return this.name;
    }
    
    public void validateAttributes() throws EmptyAttribute {
        if (this.name.isEmpty()) throw new EmptyAttribute("Dispositivo", "Nome");
    }

}
