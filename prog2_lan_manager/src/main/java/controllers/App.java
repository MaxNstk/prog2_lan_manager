package controllers;

import models.Customer;
import models.Game;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;
import views.Game.GameFormView;
import views.Game.GameListView;
import views.LoginView;
import views.MainView;

/**
 *
 * @author max
 */
public class App {
    
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }
    
    public static void openMainScreen() {
        MainView mainView = new MainView();
        mainView.setVisible(true);
    }
    
    public static void openGameCreateView() {
        GameFormView gameFormView = new GameFormView(null);
        gameFormView.setVisible(true);
    }
    
    public static void openGameUpdateView(Game game) {
        GameFormView gameCreateView = new GameFormView(game);
        gameCreateView.setVisible(true);
    }
    
    public static void openGameListView() {
        GameListView gameListView = new GameListView();
        gameListView.setVisible(true);
    }
    
    public static void openCustomerCreateView() {
        CustomerFormView customerCreateView = new CustomerFormView(null);
        customerCreateView.setVisible(true);
    }
    
    public static void openCustomerUpdateView(Customer customer) {
        CustomerFormView customerCreateView = new CustomerFormView(customer);
        customerCreateView.setVisible(true);
    }
    
    public static void openCustomerListView() {
        CustomerListView customerListView = new CustomerListView();
        customerListView.setVisible(true);
    }
    
}
