package com.coloniergames.scc.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    
    public GamePanel () {
        
        setPreferredSize (new Dimension (800, 600));
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.YELLOW);
        g2.fillRect(0, 0, getWidth (), getHeight ());
        
    }
    
    
    
}
