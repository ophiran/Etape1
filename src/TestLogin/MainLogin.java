/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLogin;

import people.dialogs.*;

/**
 *
 * @author Ophiran
 */
public class MainLogin {
    
    
    public static void main(String args[]) {
    /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogLogin().setVisible(true);
            }
        });
    }
    
    
}
