package testloginbasics;

import java.util.*;
import people.Verificateur;

public class ImplVerificateur extends Verificateur {

    private HashMap<String,String> tableHash = new HashMap<>();;
    
    
    public ImplVerificateur()
    {
        
        tableHash.put("login1", "test1");
        tableHash.put("login2", "test2");
        tableHash.put("login3", "test3");
        tableHash.put("login4", "test4");
    }
    
    @Override
    public String findPassword(String login) {
        return tableHash.get(login);
    }

   
    
}
