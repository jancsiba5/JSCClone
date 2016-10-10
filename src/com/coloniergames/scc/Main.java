package com.coloniergames.scc;

import com.coloniergames.scc.gui.GamePanel;
import javax.swing.JFrame;

public class Main extends JFrame implements Runnable {
    
    GamePanel gamePanel;
    int fps;
    double fpsTimer;
    double delta;
    long lastFrame;
    
    public Main () {
        
        gamePanel = new GamePanel ();
        
        setContentPane (gamePanel);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setTitle ("StarCraft Clone by ColonierGames");
        
        pack ();
        setVisible (true);
        
    }
    
    @Override
    public void run() {
        
        while (true) {
            
            long now = System.currentTimeMillis();
            delta = (double) (now - lastFrame) * 0.001;
            lastFrame = now;
            
            gamePanel.invalidate();
            repaint ();
            
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            fpsTimer += delta;
            if (fpsTimer >= 1.0) {
                fpsTimer = 0.0;
                System.out.println ("FPS: " + fps);
                fps = 0;
            }
            
            ++fps;
            
        }
        
    }
    
    public static void main (String [] args) {
        
        new Thread (new Main ()).start ();
        
    }

}
