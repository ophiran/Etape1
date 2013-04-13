package testloginbasics;

import people.*;

public class User extends Personne implements Utilisateur {

    private String login;
    private String password;
    
    private static final int MIN_CHAR = 4;
    
    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        if(login.length()>MIN_CHAR)
            this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPass(String password) {
        if(password.length()>MIN_CHAR)
            this.password = password;
    }
    
}
