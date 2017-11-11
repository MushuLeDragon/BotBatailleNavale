/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botbataillenavale;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Mushu
 */
public class BotBatailleNavale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String URL = "https://www.youtube.com/";
        
        
        
        

        String donnees;

        try {

            URL monURL = new URL("http://localhost/testwww/test.txt");

            URLConnection connexion = monURL.openConnection();
            InputStream flux = connexion.getInputStream();

            int donneesALire = connexion.getContentLength();

            for (; donneesALire != 0; donneesALire--) {
                System.out.print((char) flux.read());
            }

            // Fermeture de la connexion
            flux.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


