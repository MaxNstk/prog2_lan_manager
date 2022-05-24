package models;

/**
 *
 * @author max
 */
public class Game {

    public static int currentId = 0;
    String name;
    String description;
    Category category;
    protected int id;

    public Game(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.id = getCurrentId();
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
    
    public int getId(){
        return this.id;
    }
    
    public static int getCurrentId() {
        currentId =+ 1;
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

}
