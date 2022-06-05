/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author max
 */
public class InsufficientCreditsException extends Exception {
    
  public InsufficientCreditsException(){
      super("O cliente não possuí créditos suficientes para conseguir jogar!");
  }    
}
