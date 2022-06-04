/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
