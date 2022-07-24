/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Exceptions.InvalidLoginException;
import models.User;

/**
 *
 * @author max
 */
public interface IUserDAO {
    
    public void createUser(User c);
    public User retrieveUser(String username);
    public void updateUser(User c);
    public void validateUser(String username, String password) throws InvalidLoginException;
    
}
