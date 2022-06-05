package models;

/**
 *
 * @author max
 */
public class Category {

    public static int currentId = 0;
    protected int id;
    private int creditsValue;
    private String name;

    public Category(String name, int creditsValue) {
        this.id = getCurrentId();
        this.name = name;
        this.creditsValue = creditsValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditsValue(){
        return creditsValue;
    }

    public void setCreditsValue(int creditsValue) {
        this.creditsValue = creditsValue;
    }

    public static int getCurrentId() {
        currentId = +1;
        return currentId;
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
}
