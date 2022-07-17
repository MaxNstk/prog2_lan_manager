
package Exceptions;

/**
 *
 * @author JEKrieger
 */
public class EmptyFieldException extends IllegalArgumentException {

    public EmptyFieldException() {
        super("Todos os campos devem ser preenchidos!");
    }
}