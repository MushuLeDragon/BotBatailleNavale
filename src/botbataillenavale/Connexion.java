/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botbataillenavale;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author Mushu
 */
public class Connexion {

    public static void Connexion() {

        String URL = "http://fr.battleship-game.org/";

        try {

            Desktop d = Desktop.getDesktop();
            d.browse(new URI(URL));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
