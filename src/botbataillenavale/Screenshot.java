/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botbataillenavale;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Mushu
 */
public class Screenshot {

    public static void Screenshot() throws InterruptedException {
        //Delai avant exécution du code pour laisser le temps de capturer
        Thread.sleep(1000);

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
            //ImageIO.write(img, "jpg", new File("D:\\Development\\GitHub\\JavaProjects\\BotBatailleNavale\\Screenshots\\screenshot.jpg"));
            ImageIO.write(img, "jpg", new File("D:\\Informatique\\GitHub\\BotBatailleNavale\\Screenshots\\screenshot.jpg"));           
            
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
