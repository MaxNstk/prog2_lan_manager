package Exceptions;

/**
 *
 * @author petrix
 */
public class EmptyAttribute extends Exception {

    public EmptyAttribute(String object, String attribute) {
        super("Erro: não é permitido incluir o " + object + " sem informar o(s)/a(s): " + attribute);
    }

}
