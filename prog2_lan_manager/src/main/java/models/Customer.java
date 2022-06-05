
package models;
/**
 *
 * @author max
 */
public class Customer extends Person implements Comparable<Customer>{
    
    private int creditsAmount;

    public Customer(String name, String CPF, String adress, String birthDate) {
        super(name, CPF, adress, birthDate);
        this.creditsAmount = 0;
    }

    public int getCreditsAmount() {
        return creditsAmount;
    }
    
    public void addCredits(int credits){
        this.creditsAmount += credits;
    }
    
    public void decreaseCredits(int credits){
        this.creditsAmount -= credits;
    }
    
    @Override
    public int compareTo(Customer c){
        return this.name.compareTo(c.name);
    }
    
    @Override
    public String toString(){
        return this.name+": "+this.creditsAmount+" créditos";
    }
    
}
