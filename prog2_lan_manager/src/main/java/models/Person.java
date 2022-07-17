package models;

import Exceptions.EmptyFieldException;

/**
 *
 * @author max
 */
public abstract class Person {

    protected int id;
    protected String name;
    protected String CPF;
    protected String adress;
    protected String birthDate;
    protected boolean active;

    public Person(String name, String CPF, String adress, String birthDate) {
        this.name = validateNotNull(name);
        this.CPF = validateNotNull(CPF);
        this.adress = validateNotNull(adress);
        this.birthDate = validateNotNull(birthDate);
        this.active = true;
    }
    
    public Person(int id, String name, String CPF, String adress, String birthDate) {
        this.id = id;
        this.name = validateNotNull(name);
        this.CPF = validateNotNull(CPF);
        this.adress = validateNotNull(adress);
        this.birthDate = validateNotNull(birthDate);
        this.active = true;
    }

    public String validateNotNull(String value) throws EmptyFieldException {
        if (value == null || value.isEmpty()) {
            throw new EmptyFieldException();
        }
        return value;
    }

    public void setName(String name) throws EmptyFieldException {
        this.name = name;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getAdress() {
        return this.adress;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
