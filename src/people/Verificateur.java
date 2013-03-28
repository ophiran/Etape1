package people;


public abstract class Verificateur {
    public boolean verifLogin(Utilisateur u)
    {
        return u.getPassword().equals(findPassword(u.getLogin()));
    }
    
    public abstract String findPassword(String login);
    
}
