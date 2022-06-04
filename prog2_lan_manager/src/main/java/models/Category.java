package models;

import Exceptions.EmptyFieldException;

/**
 *
 * @author max
 */
public class Category {

    public static int currentId = 0;
    protected int id;
    private double creditsValue;
    private String name;

    public Category(String name) {
        this.id = getCurrentId();
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
