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
        Customer alan = new Customer("Alan Santos", "111.222.333-44", "Rua Alvarez, 123", "09/11/2001");
        customerDAO.createCustomer(alan);
        Customer bruna = new Customer("Bruna Pereira", "222.333.444-55", "Rua Stein, 233", "10/02/2004");
        customerDAO.createCustomer(bruna);
        Customer maria = new Customer("Maria Alves", "333.444.555-66", "Avenida Ramos, 333", "17/05/1999");
        customerDAO.createCustomer(maria);
        Customer pedro = new Customer("Pedro Gustavo", "444.555.666-77", "Rua Gertrudes, 901", "25/07/2000");
        customerDAO.createCustomer(pedro);
        
        DeviceDAO deviceDAO = new DeviceDAO();
        Computer computador1 = new Computer("Computador 1", "Intel i5 | RAM DDR4 8GB | GTX1650 2GB", true);
        deviceDAO.createDevice(computador1);
        Computer computador2 = new Computer("Computador 2", "AMD Ryzen 7 | RAM DDR5 16GB | RTX3060 6GB", true);
        deviceDAO.createDevice(computador2);
        Computer computador3 = new Computer("Computador 3", "Pentium | RAM DDR3 4GB | GTX1050 2GB", true);
        deviceDAO.createDevice(computador3);
        Console xboxSeriesX = new Console("Xbox Series X", true);
        deviceDAO.createDevice(xboxSeriesX);
        Console playstation5 = new Console("Playstation 5", true);
        deviceDAO.createDevice(playstation5);
        
        CategoryDAO categoryDAO = new CategoryDAO();
        Category fps = new Category("FPS");
        categoryDAO.createCategory(fps);
        Category estrategia = new Category("Estratégia");
        categoryDAO.createCategory(estrategia);
        Category battleRoyale = new Category("Battle Royale");
        categoryDAO.createCategory(battleRoyale);
        Category acao = new Category("Ação");
        categoryDAO.createCategory(acao);
        Category luta = new Category("Luta");
        categoryDAO.createCategory(luta);
        Category sobrevivencia = new Category("Sobrevivência");
        categoryDAO.createCategory(sobrevivencia);
        Category rpg = new Category("RPG");
        categoryDAO.createCategory(rpg);
        
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
