
package controllers;

import Connection.SQLConnection;
import daos.CategoryDAO;
import daos.CustomerDAO;
import daos.DeviceDAO;
import daos.GameDAO;
import daos.UserDAO;
import models.Category;
import models.Computer;
import models.Console;
import models.Customer;
import models.Device;
import models.Game;
import models.User;
import views.Customer.AddCreditsView;
import views.Customer.CustomerFormView;
import views.Customer.CustomerListView;
import views.Device.DeviceFormView;
import views.Device.DeviceListView;
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
        
        LoginController loginController = new LoginController(new LoginView());
        loginController.showScreen();
        
//        MainViewController mainView =  new MainViewController(new MainView());
//        mainView.showScreen();       
               
//        UserDAO userDAO = new UserDAO();
//        userDAO.createUser(new User("admin","admin","Alan Santos", "111.222.333-44", "Rua Alvarez, 123", "09/11/2001"));
//        userDAO.createUser(new User("max","admin","Alan Santos", "111.222.333-44", "Rua Alvarez, 123", "09/11/2001"));

//        CustomerDAO customerDAO = new CustomerDAO();
//        Customer alan = new Customer("Alan Santos", "111.222.333-44", "Rua Alvarez, 123", "09/11/2001");
//        alan.addCredits(15);
//        customerDAO.createCustomer(alan);
//        Customer bruna = new Customer("Arthur Espingola", "222.333.444-55", "Rua dos bobos, 0", "10/02/2004");
//        bruna.addCredits(-250);
//        customerDAO.createCustomer(bruna);
//        Customer maria = new Customer("Maria Alves", "333.444.555-66", "Avenida Ramos, 333", "17/05/1999");
//        customerDAO.createCustomer(maria);
//        maria.addCredits(10);
//        Customer pedro = new Customer("Mattheus do Minuto", "444.555.666-77", "Leblon, 901", "25/07/2000");
//        customerDAO.createCustomer(pedro);
//        pedro.addCredits(1000);
////        
//        DeviceDAO deviceDAO = new DeviceDAO();
//        Computer computador1 = new Computer("Computador 1", "Intel i5 | RAM DDR4 8GB | GTX1650 2GB", true);
//        deviceDAO.createDevice(computador1);
//        Computer computador2 = new Computer("Computador 2", "AMD Ryzen 7 | RAM DDR5 16GB | RTX3060 6GB", true);
//        deviceDAO.createDevice(computador2);
//        Computer computador3 = new Computer("Computador 3", "Pentium | RAM DDR3 4GB | GTX1050 2GB", true);
//        deviceDAO.createDevice(computador3);
//        Console xboxSeriesX = new Console("Xbox Series X", "Slim", true);
//        deviceDAO.createDevice(xboxSeriesX);
//        Console playstation5 = new Console("Playstation 5", "Slim", true);
//        deviceDAO.createDevice(playstation5);
//        
        CategoryDAO categoryDAO = new CategoryDAO();
//        Category fps2 = new Category("FPS", 3);
//        categoryDAO.createCategory(fps2);
//        Category estrategia = new Category("Estratégia", 1);
//        categoryDAO.createCategory(estrategia);
//        Category battleRoyale = new Category("Battle Royale", 2);
//        categoryDAO.createCategory(battleRoyale);
//        Category acao = new Category("Ação",3);
//        categoryDAO.createCategory(acao);
//        Category luta = new Category("Luta", 2);
//        categoryDAO.createCategory(luta);
//        Category sobrevivencia = new Category("Sobrevivência", 2);
//        categoryDAO.createCategory(sobrevivencia);
//        Category rpg = new Category("RPG", 1);
//        categoryDAO.createCategory(rpg);
//        
//        GameDAO gameDAO = new GameDAO();
//        Game ageOfEmpires = new Game("Age of Empires", "Civilizações ancestrais", categoryDAO.retrieveCategory(1));
//        gameDAO.createGame(ageOfEmpires);
//        Game Chess = new Game("Chess", "Xadrez clássico", categoryDAO.retrieveCategory(2));
//        gameDAO.createGame(Chess);
//        Game CounterStrike = new Game("Counter-Strike", "FPS multiplayer", categoryDAO.retrieveCategory(3));
//        gameDAO.createGame(CounterStrike);
//        Game Warzone = new Game("Warzone", "Armas e sobrevivência", categoryDAO.retrieveCategory(4));
//        gameDAO.createGame(Warzone);
    }   
}
