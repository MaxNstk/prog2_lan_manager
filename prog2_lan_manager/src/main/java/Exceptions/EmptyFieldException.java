/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
