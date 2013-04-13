package people;


public abstract class Verificateur {
    public final boolean verifLogin(Utilisateur u)
    {
        return verifLogin(u.getLogin(),u.getPassword());
    }
    
    public final boolean verifLogin(String login,String password)
    {
        return password.equals(findPassword(login));
    }
    
    public abstract String findPassword(String login);
    
}
