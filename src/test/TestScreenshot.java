/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/**
 *
 * @author Mushu
 */
public class TestScreenshot {

    public static void TestScreenshot() {

        //x, y = Position du rectangle
        int x = 10;
        int y = 20;
        //Width, height = taille du rectangle
        int width = 3;
        int height = 6;

        try {

            Robot robot = new Robot();
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            BufferedImage img = robot.createScreenCapture(new Rectangle(size));
        } catch (AWTException e) {
            e.printStackTrace();
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }

    }

}
