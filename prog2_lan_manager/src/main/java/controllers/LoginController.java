package controllers;

import javax.swing.JOptionPane;
import views.LoginView;
import views.MainView;

/**
 *
 * @author petrix
 */
public class LoginController {

    public void verifyUserHasAccess(String login, String password, LoginView loginView) {
        if (login.equals("admin") && password.equals("admin")) {
            this.openMainScreen();
            loginView.setVisible(false);
        } else {
            this.showMessageInvalidLogin();
        }
    }

    private void openMainScreen() {
        MainViewController mainViewController = new MainViewController(new MainView());
        mainViewController.showScreen();
    }

    private void showMessageInvalidLogin() {
        JOptionPane.showMessageDialog(null, "Login inválido!");
    }

}
