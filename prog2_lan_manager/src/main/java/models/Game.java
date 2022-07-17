package models;

import Exceptions.EmptyFieldException;

/**
 *
 * @author max
 */
public class Game {

    String name;
    String description;
    Category category;
    protected int id;

    public Game(String name, String description, Category category) {
        this.name = validateNotNull(name);
        this.description = validateNotNull(description);
        this.category = category;
    }
    public Game(int id, String name, String description, Category category) {
        this.id = id;
        this.name = validateNotNull(name);
        this.description = validateNotNull(description);
        this.category = category;
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
    
    public void setId(int id){
        this.id = id;
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
    
    @Override
    public String toString() {
        return this.name+". Valor: "+this.category.getCreditsValue();
    }
}
