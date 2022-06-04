/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author João Eduardo
 */
public class InvalidDateException extends Exception {

    public InvalidDateException(String message) {
        super("Erro: Data inválida");
    }
}
