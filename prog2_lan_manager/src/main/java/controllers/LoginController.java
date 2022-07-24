package controllers;

import Exceptions.InvalidLoginException;
import daos.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.LoginView;
import views.MainView;

/**
 *
 * @author petrix
 */
public class LoginController {
    
    private LoginView loginView;
    private UserDAO userDAO;
    
    public LoginController(LoginView loginView){
        this.loginView = loginView;
        this.userDAO = new UserDAO();
        addLoginAction();
    }
    
    public void showScreen(){
        this.loginView.setVisible(true);
    }

    public void addLoginAction() {
        loginView.addLoginButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verifyUserHasAccess();
            }
        });
    }
    public void verifyUserHasAccess() {
        try{
            userDAO.validateUser(this.loginView.getUsername(), this.loginView.getPassword());
            openMainScreen();
        }catch (InvalidLoginException e){
           this.loginView.showMessage(e.getMessage());
        } 
    }

    private void openMainScreen() {
        MainViewController mainViewController = new MainViewController(new MainView());
        mainViewController.showScreen();
        this.loginView.setVisible(false);
    }

}
