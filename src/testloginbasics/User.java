package testloginbasics;

import people.*;

public class User extends Personne implements Utilisateur {

    private String login;
    private String password;
    
    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPass(String password) {
        this.password = password;
    }
    
}
