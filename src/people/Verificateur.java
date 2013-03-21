package people;


public abstract class Verificateur {
    public abstract boolean validation(String username,String password);
    public abstract boolean validation(Utilisateur utilisateur);
    
}
