
package models;

/**
 *
 * @author max
 */
public class Category {

    private int id;
    private double creditsValue;
    private String description;

    public Category(int id, double creditsValue, String description) {
        this.id           = id;
        this.creditsValue = creditsValue;
        this.description  = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCreditsValue() {
        return creditsValue;
    }

    public void setCreditsValue(double creditsValue) {
        this.creditsValue = creditsValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
