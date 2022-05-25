package controllers;

import javax.swing.JOptionPane;
import views.LoginView;

/**
 *
 * @author petrix
 */
public class LoginController {

    /**
     * Verifica se os logins informados estão presentes na base de dados
     *
     * @todo - Atualmente, não há uma integração com o banco de dados, e por
     * este motivo o login segue "chumbado"
     * @param login
     * @param password
     * @return boolean
     */
    public void verifyUserHasAccess(String login, String password, LoginView loginView) {
        if (login.equals("admin") && password.equals("admin")) {
            this.openMainScreen();
            loginView.setVisible(false);
        } else {
            this.showMessageInvalidLogin();
        }
    }

    private void openMainScreen() {
        App App = new App();
        App.openMainScreen();
    }

    private void showMessageInvalidLogin() {
        JOptionPane.showMessageDialog(null, "Login inválido!");
    }

}
