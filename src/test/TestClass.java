/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author Mushu
 */
public class TestClass {
    
    public static void main(String[] args) throws Exception {
        
        //http://fr.battleship-game.org/
        
        String URL = "https://www.youtube.com/";
        
        
        Desktop.getDesktop().browse(new URI(URL));
        
        /*
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("www.youtube.com"));
        */
    }
    
}
