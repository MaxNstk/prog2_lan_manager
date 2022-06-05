/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author JEKrieger
 */
public class NullSelectionException extends Exception {

    public NullSelectionException(String object) {
        super("Erro: Não há objeto selecionado.");
    }
}
