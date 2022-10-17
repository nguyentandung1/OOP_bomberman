/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 *
 * @author admin
 */
public class GamePanel extends JPanel implements Runnable, KeyListener {
    
    private Thread thread;
    
    private boolean isRunning;
    
    private InputManger inputManger;
    
    BufferedImage image;
    BufferedImage subImage;
    
    public GamePanel(){
        
        inputManger = new InputManger();
        
        try {
            image = ImageIO.read(new File("data/classic.png"));
            subImage = image.getSubimage(240, 0, 40, 48);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    @Override
    public void paint(Graphics g){
        
      g.setColor(Color.green);
      g.fillRect(0, 0, GameFrame.SCREEN_WIDTH, GameFrame.SCREEN_HEIGHT);
      
      g.drawImage(subImage,  10, 10, this);
      
    }
    
    public void startGame(){
        if(thread == null){
            isRunning = true;
            thread = new Thread(this);
            thread.start();
        }
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public void run() {
        
        long FPS = 80;
        long period = 1000*1000000/FPS;
        long beginTime;
        long sleepTime;
        
        int a = 1;
        
        beginTime = System.nanoTime();
       while (isRunning){
           
           //System.out.println("a= "+ (a++));
           //update
           //render
           
           long deltaTime = System.nanoTime() - beginTime;
           sleepTime = period - deltaTime;
           
           
           try{
              if(sleepTime > 0)
                Thread.sleep(sleepTime/1000000);
              else Thread.sleep(period/2000000);
           } catch (InterruptedException ex){}
           
           beginTime = System.nanoTime();
           
       }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
     
    }

    @Override
    public void keyPressed(KeyEvent e) { //callback method
       
       inputManger.processKeyPressed(e.getKeyCode());
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        inputManger.processKeyRelease(e.getKeyCode());
        
    }
    
}
