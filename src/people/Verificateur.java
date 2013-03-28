package people;


public abstract class Verificateur {
    public final boolean verifLogin(Utilisateur u)
    {
        return u.getPassword().equals(findPassword(u.getLogin()));
    }
    
    public abstract String findPassword(String login);
    
}
