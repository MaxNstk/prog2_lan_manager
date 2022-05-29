
package models;

/**
 *
 * @author max
 */
public class Category {

    private int id;
    private double creditsValue;
    private String name;

    public Category(int id, double creditsValue, String name) {
        this.id = id;
        this.creditsValue = creditsValue;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
