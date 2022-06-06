
package Exceptions;

/**
 *
 * @author max
 */
public class EmptyCbException extends Exception {
    
    public EmptyCbException(String object){
        super("Erro: você deve selecionar algum "+object+" para continuar");
    }
}
