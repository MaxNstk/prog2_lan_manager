package models;

import Exceptions.EmptyFieldException;

/**
 *
 * @author max
 */
public class Game {

    public static int currentId = 0;
    String name;
    Device device;
    String description;
    Category category;
    protected int id;

    public Game(String name, String description, Category category) {
        this.name = validateNotNull(name);
        this.description = validateNotNull(description);
        this.category = category;
        this.id = getCurrentId();
    }

    public String validateNotNull(String value) throws EmptyFieldException {
        if (value == null || value.isEmpty()) {
            throw new EmptyFieldException();
        }
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return this.id;
    }

    public static int getCurrentId() {
        currentId++;
        return currentId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return this.name+". Valor: "+this.category.getCreditsValue();
    }
}
