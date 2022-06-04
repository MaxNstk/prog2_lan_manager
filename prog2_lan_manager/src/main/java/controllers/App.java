package controllers;

import daos.CategoryDAO;
import daos.CustomerDAO;
import daos.DeviceDAO;
import daos.GameDAO;
import models.Category;
import models.Computer;
import models.Console;
import models.Customer;
import models.Game;
import views.Customer.AddCreditsView;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;
import views.Game.GameFormView;
import views.Game.GameListView;
import views.Gameplay.GameplayFormView;
import views.Gameplay.GameplayListView;
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
        
        CustomerDAO customerDAO = new CustomerDAO();
        Customer leandro = new Customer("Leandro", "11122233344", "Rua Alvarez, 123", "09112001");
        customerDAO.createCustomer(leandro);
        Customer marcos = new Customer("Marcos", "22233344455", "Rua Stein, 233", "10022004");
        customerDAO.createCustomer(marcos);
        Customer maria = new Customer("Maria", "33344455566", "Avenida Ramos, 333", "17051999");
        customerDAO.createCustomer(maria);
        Customer ana = new Customer("Ana", "44455566677", "Rua Gertrudes", "25072000");
        customerDAO.createCustomer(ana);
        
        DeviceDAO deviceDAO = new DeviceDAO();
        Computer computador1 = new Computer("Computador 1", "Intel i5 | RAM DDR4 8GB | GTX1650 2GB", true);
        deviceDAO.createDevice(computador1);
        Computer computador2 = new Computer("Computador 2", "AMD Ryzen 7 | RAM DDR5 16GB | RTX3060 6GB", true);
        deviceDAO.createDevice(computador2);
        Computer computador3 = new Computer("Computador 3", "Pentium | RAM DDR3 4GB | GTX1050 2GB", true);
        deviceDAO.createDevice(computador3);
        Console xboxSeriesX = new Console("Xbox Series X", true);
        deviceDAO.createDevice(xboxSeriesX);
        Console xboxSeriesS = new Console("Xbox Series S", true);
        deviceDAO.createDevice(xboxSeriesS);
        Console playstation5 = new Console("Playstation 5", true);
        deviceDAO.createDevice(xboxSeriesS);
        Console playstation4 = new Console("Playstation 4", true);
        deviceDAO.createDevice(xboxSeriesS);
        
        CategoryDAO categoryDAO = new CategoryDAO();
        Category fps = new Category(40, "FPS");
        categoryDAO.createCategory(fps);
        Category estrategia = new Category(20, "Estratégia");
        categoryDAO.createCategory(estrategia);
        Category battleRoyale = new Category(60, "Battle Royale");
        categoryDAO.createCategory(battleRoyale);
        
        GameDAO gameDAO = new GameDAO();
        Game ageOfEmpires = new Game("Age of Empires", "Civilizações ancestrais", estrategia);
        gameDAO.createGame(ageOfEmpires);
        Game Chess = new Game("Chess", "Xadrez clássico", estrategia);
        gameDAO.createGame(Chess);
        Game CounterStrike = new Game("Counter-Strike", "FPS multiplayer", fps);
        gameDAO.createGame(CounterStrike);
        Game Warzone = new Game("Warzone", "Armas e sobrevivência", battleRoyale);
        gameDAO.createGame(Warzone);
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
    
    public static void openGamePlayFormView() {
        GameplayFormView gameplayFormView = new GameplayFormView();
        gameplayFormView.setVisible(true);
    }
    
    public static void openAddCreditsView(int id) {
        AddCreditsView addCreditsView = new AddCreditsView(id);
        addCreditsView.setVisible(true);
    }
    
    public static void openGameplayListView() {
        GameplayListView gameplayListView = new GameplayListView();
        gameplayListView.setVisible(true);
    }    
}
