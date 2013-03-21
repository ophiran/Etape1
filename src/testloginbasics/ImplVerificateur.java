package testloginbasics;

import people.Utilisateur;
import people.Verificateur;

public class ImplVerificateur extends Verificateur {

    @Override
    public boolean validation(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validation(Utilisateur utilisateur) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
