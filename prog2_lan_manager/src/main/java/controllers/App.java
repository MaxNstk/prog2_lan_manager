
package controllers;

import views.LoginView;

/**
 *
 * @author max
 */
public class App {
    
    public static void main(String[] args) {
        
        LoginController loginController = new LoginController(new LoginView());
        loginController.showScreen();
        
    }   
}
