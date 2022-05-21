/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author max
 */

public class Customer extends Person {
    
    private int creditsAmount;

    public Customer(String name, String CPF, String adress, String birthDate) {
        super(name, CPF, adress, birthDate);
        this.creditsAmount = 0;
    }

    public int getCreditsAmount() {
        return creditsAmount;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Créditos disponíveis: "+this.creditsAmount+".";
    }
    
}
