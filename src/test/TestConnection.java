/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author Mushu
 */
public class TestConnection {

    public static void TestConnection() {

        String URL = "http://fr.battleship-game.org/";

        try {

            Desktop d = Desktop.getDesktop();
            d.browse(new URI(URL));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
