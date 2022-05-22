package models;

import java.time.LocalDate;

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
        this.name = name;
        this.CPF = CPF;
        this.adress = adress;
        this.birthDate = birthDate;
        this.active = true;
        
    }

    public void setName(String name) {
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
    
    public int getId(){
        return this.id;
    }
    
    private static int getCurrentId(){
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
