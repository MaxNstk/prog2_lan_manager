package models;

import java.time.LocalDate;

/**
 *
 * @author max
 */
public abstract class Person {

    protected String name;
    protected String CPF;
    protected String adress;
    protected String birthDate;
    protected boolean active;

    public Person(String name, String CPF, String adress, String birthDate) {
        this.name      = name;
        this.CPF       = CPF;
        this.adress    = adress;
        this.birthDate = birthDate;
        this.active    = true;
    }

    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }

    public String getAdress() {
        return adress;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        String response = "Nome: " + this.name + "; CPF: " + this.CPF + "; ";
        response += "Endereço: " + this.adress + "; ";
        response += "Data de nascimento: " + this.birthDate + ";";
        return response;
    }

}
