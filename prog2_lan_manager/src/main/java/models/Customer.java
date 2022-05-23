
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
    
    @Override
    public String toString(){
        return super.toString()+" Créditos disponíveis: "+this.creditsAmount+".";
    }
    
    @Override
    public int compareTo(Customer c){
        return this.name.compareTo(c.name);
    }
    
}
