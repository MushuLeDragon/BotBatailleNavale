/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/**
 *
 * @author Mushu
 */
public class TestCapture {
    
    public static void TestCapture() {
        
        //x, y = Position du rectangle
        int x = 10;
        int y = 20;
        //Width, height = taille du rectangle
        int width = 3;
        int height = 6;
                
         try { 
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
            Robot robot = new Robot(); 
            BufferedImage img = robot.createScreenCapture(new Rectangle(x, y, width, height)); 
        } catch(Exception e) { 
            
        } 
        
    }   
    
}
