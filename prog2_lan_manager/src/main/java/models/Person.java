/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author max
 */
public abstract class Person {
    
    protected String name;
    protected final String CPF;
    protected String adress;
    protected String birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String CPF, String adress, String birthDate) {
        this.name = name;
        this.CPF = CPF;
        this.adress = adress;
        this.birthDate = birthDate;
    }
    
    public String getCPF() {
        return CPF;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
}
