/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author admin
 */
public class InputManger {
    
    public void processKeyPressed(int keyCode){
        
        switch (keyCode){
            
            case KeyEvent.VK_UP:
                System.out.println("You press up");
                break;
            
            case KeyEvent.VK_DOWN:
            
                break;
            
            case KeyEvent.VK_LEFT:
                
                break;
                
            case KeyEvent.VK_RIGHT:
                
                break;
                
            case KeyEvent.VK_ENTER:
            
                break;
                
            case KeyEvent.VK_SPACE:
                break;
                
            case KeyEvent.VK_A:
                
                break;
            
        }
        
    }
    
    public void processKeyRelease(int keyCode){
        
        switch (keyCode){
            
            case KeyEvent.VK_UP:
                System.out.println("You released up");
                break;
            
            case KeyEvent.VK_DOWN:
            
                break;
            
            case KeyEvent.VK_LEFT:
                
                break;
                
            case KeyEvent.VK_RIGHT:
                
                break;
                
            case KeyEvent.VK_ENTER:
            
                break;
                
            case KeyEvent.VK_SPACE:
                break;
                
            case KeyEvent.VK_A:
                
                break;
            
        }
        
    }
    
}
