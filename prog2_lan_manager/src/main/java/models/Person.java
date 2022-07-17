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
    protected String address;
    protected String birthDate;
    protected boolean active;

    public Person(String name, String CPF, String address, String birthDate) {
        this.name = validateNotNull(name);
        this.CPF = validateNotNull(CPF);
        this.address = validateNotNull(address);
        this.birthDate = validateNotNull(birthDate);
        this.active = true;
    }
    
    public Person(int id, String name, String CPF, String address, String birthDate) {
        this.id = id;
        this.name = validateNotNull(name);
        this.CPF = validateNotNull(CPF);
        this.address = validateNotNull(address);
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

    public void setaddress(String address) {
        this.address = address;
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

    public String getaddress() {
        return this.address;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
