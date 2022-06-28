package models;

import java.util.Objects;

/**
 *
 * @author max
 */
public class Category {

    private static int currentId = 0;
    private final int id;
    private int creditsValue;
    private String name;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        return Objects.equals(this.name, other.name);
    }

    public Category(String name, int creditsValue) {
        this.id = getCurrentId();
        this.name = name;
        this.creditsValue = creditsValue;
    }
    
    public static int getCurrentId() {
        currentId = +1;
        return currentId;
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
    
    
}
