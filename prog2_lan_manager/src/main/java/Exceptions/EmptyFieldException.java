
package Exceptions;

/**
 *
 * @author JEKrieger
 */
public class EmptyFieldException extends IllegalArgumentException {

    public EmptyFieldException(String message) {
        super("Erro: O valor não deve ser nulo ou vazio.");
    }
}