package models;

/**
 *
 * @author max
 */
public class User extends Person {

    private String login;
    private String password;

    public User(String login, String password, String name, String CPF, String address, String birthDate) {
        super(name, CPF, address, birthDate);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
