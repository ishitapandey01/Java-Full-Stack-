 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ishitapandey
 */
import java.util.Scanner;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setSize(400,400);
       frame.setLayout(null);
       frame.setVisible(true);
       
       JButton b1 =new JButton("Click me");
       b1.setBounds(120,100,100,50);
       frame.add(b1);
    }
    
}
