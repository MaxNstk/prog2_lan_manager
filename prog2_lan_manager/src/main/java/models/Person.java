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
    protected String CPF;
    protected String adress;
    protected String birthDate; 

    public Person(String name, String CPF, String adress, String birthDate) {
        this.name = name;
        this.CPF = CPF;
        this.adress = adress;
        this.birthDate = birthDate;
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
    
}