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
    
  public InsufficientCreditsException(int customerCredits, int necessaryCredits){
      super("O cliente possuí "+customerCredits+" créditos. "
      + "Entretanto são necessários "+necessaryCredits+" para conseguir jogar!");
  }    
}
