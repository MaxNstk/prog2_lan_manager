package models;

/**
 *
 * @author max
 */
public class Category {

    private int id;
    private int creditsValue;
    private String name;

    public Category(String name, int creditsValue) {
        this.name = name;
        this.creditsValue = creditsValue;
    }
    
    public Category(int id, String name, int creditsValue) {
        this.id = id;
        this.name = name;
        this.creditsValue = creditsValue;
    }

    public int getId() {
        return this.id;
    }

    public int getCreditsValue(){
        return creditsValue;
    }

    public void setCreditsValue(int creditsValue) {
        this.creditsValue = creditsValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
