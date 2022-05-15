/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author max
 */
public class User extends Person {

        private String login;
        private String password;
        protected boolean isSuperUser;

    public User(String login, String password, boolean isSuperUser, String name, String CPF, String adress, String birthDate) {
        super(name, CPF, adress, birthDate);
        this.login = login;
        this.password = password;
        this.isSuperUser = isSuperUser;
    }
              
}
