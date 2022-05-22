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

    public boolean isIsSuperUser() {
        return isSuperUser;
    }

    public void setIsSuperUser(boolean isSuperUser) {
        this.isSuperUser = isSuperUser;
    }

}
