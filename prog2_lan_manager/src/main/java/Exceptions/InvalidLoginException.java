/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author max
 */
public class InvalidLoginException extends Exception {
    
    public InvalidLoginException(){
        super("Credenciais inválidas");
    }
    
}
