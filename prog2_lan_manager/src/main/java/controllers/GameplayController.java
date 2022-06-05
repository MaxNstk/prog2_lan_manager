/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Exceptions.InsufficientCreditsException;
import daos.GameplayDAO;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import models.Customer;
import models.Device;
import models.Game;
import models.Gameplay;

/**
 *
 * @author max
 */
public class GameplayController {

    GameplayDAO gameplayDAO = new GameplayDAO();

    public List<Gameplay> getGameplays(int selectedFilter) {
        if (selectedFilter == 0) {
            return gameplayDAO.getActiveGamplays();
        } else {
            return gameplayDAO.getGameplays();
        }
    }

    public void createGameplay(Map<String, Object> customerData) throws InsufficientCreditsException {
        Customer customer = (Customer) customerData.get("customer");
        Device device = (Device) customerData.get("device");
        Game game = (Game) customerData.get("game");
        int timePlaying = Integer.parseInt((String) customerData.get("timePlaying"));
        if (!this.validateIfCustomerCanPlay(customer, game, timePlaying)) {
            throw new InsufficientCreditsException(
                    customer.getCreditsAmount(), (game.getCategory().getCreditsValue() * timePlaying));
        }
        gameplayDAO.createGameplay(new Gameplay(customer, game, device, timePlaying));
    }

    public boolean validateIfCustomerCanPlay(Customer customer, Game game, int timePlaying) {
        if (customer.getCreditsAmount() < game.getCategory().getCreditsValue() * timePlaying) {
            return false;
        } else {
            return true;
        }
    }

    public void updateCurrentGameplays() {
        for (Gameplay gameplay : gameplayDAO.getActiveGamplays()) {
            if (LocalDateTime.now().isAfter(gameplay.getEndDateTime())) {
                gameplay.setPlayingStatus(false);
            }
        }
    }

    public void cancelGameplay(int id) {
        Gameplay gameplay = gameplayDAO.retrieveGameplay(id);
        gameplay.setPlayingStatus(false);
    }

}
