package models;

import java.util.List;

/**
 *
 * @author max
 */
public abstract class Device {

    public static int currentId = 0;
    protected boolean active;
    protected boolean available;
    protected int id;
    protected String name;

    public Device(String name, boolean active) {
        this.id = getCurrentId();
        this.name = name;
        this.active = active;
        this.available = true;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public void setAvailableStatus(boolean status){
        this.available = status;
    }

    public static int getCurrentId() {
        currentId = +1;
        return currentId;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return this.name;
    }

}
