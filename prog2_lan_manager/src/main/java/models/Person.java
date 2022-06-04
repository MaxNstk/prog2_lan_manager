package models;

import Exceptions.EmptyFieldException;
import javax.swing.JOptionPane;

/**
 *
 * @author max
 */
public abstract class Person {

    private static int currentId = 0;
    protected int id;
    protected String name;
    protected String CPF;
    protected String adress;
    protected String birthDate;
    protected boolean active;

    public Person(String name, String CPF, String adress, String birthDate) {
        this.id = getCurrentId();
        this.name = validateNotNull(name);
        this.CPF = validateNotNull(CPF);
        this.adress = validateNotNull(adress);
        this.birthDate = validateNotNull(birthDate);
        this.active = true;

    }

    public String validateNotNull(String value) throws EmptyFieldException {
        if (value == null || value.isEmpty()) {
            throw new EmptyFieldException("O valor não deve ser nulo ou vazio");
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

    private static int getCurrentId() {
        currentId += 1;
        return currentId;
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
        String response = "Nome: " + this.name + "; CPF: " + this.CPF + "; ";
        response += "Endereço: " + this.adress + "; ";
        response += "Data de nascimento: " + this.birthDate + ";";
        return response;
    }

}
