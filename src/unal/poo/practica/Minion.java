/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import java.awt.*;
import becker.robots.icons.*;
import java.awt.image.BufferedImage;

public class Minion extends Icon
{
    public Minion()
    {
        // Constructor
        super();
    }
    public void paintIcon(Graphics g)
    {
        
        
        // Draw body
        g.setColor(Color.GRAY);
        g.fillOval(30, 30, 40, 40);
        // Draw shoulders
        g.setColor(Color.BLUE);
        g.fillRect(20, 45, 10, 10);
        g.fillRect(70, 45, 10, 10);
        // Draw arms
        g.setColor(Color.GREEN);
        g.fillOval(20, 20, 10, 35);
        g.fillOval(70, 20, 10, 35);
        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(35, 40, 10, 10);
        g.fillOval(55, 40, 10, 10);
    }
}
