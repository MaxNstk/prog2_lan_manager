
package models;
/**
 *
 * @author max
 */
public class Customer extends Person implements Comparable<Customer>{
    
    private int creditsAmount;

    public Customer(String name, String CPF, String address, String birthDate) {
        super(name, CPF, address, birthDate);
        this.creditsAmount = 0;
    }

    public Customer(int id, String name, String CPF, String address, String birthDate, int creditsAmount) {
        super(id, name, CPF, address, birthDate);
        this.creditsAmount = creditsAmount;
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
