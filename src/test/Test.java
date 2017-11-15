/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import static test.TestCapture.TestCapture;
import static test.TestConnection.TestConnection;

/**
 *
 * @author Mushu
 */
public class Test {
    
    public static void main(String[] args) throws Exception {
        
        TestConnection();
        TestCapture();
    }
    
}
