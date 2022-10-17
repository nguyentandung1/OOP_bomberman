/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package effect;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Animation {
    
    private String name;
    
    private boolean isRepeated;
    
    private ArrayList<FrameImage> frameImages;
    private int currentFrame;
    
    private ArrayList<Boolean> ignoreFrames;
    
    private ArrayList<Double> delayFrames;
    private long beginTime;
    
    private boolean drawRectFrame;
    
    public Animation() {
        delayFrames = new ArrayList<Double>();
        beginTime = 0;
        currentFrame = 0;
        
        ignoreFrames = new ArrayList<Boolean>();
        
        frameImages = new ArrayList<FrameImage>();
        
        drawRectFrame = false;
        
        isRepeated = true;
    }
    
    public Animation(Animation animation){
        beginTime = animation.beginTime;
        currentFrame = animation.currentFrame;
        drawRectFrame = animation.drawRectFrame;
        isRepeated = animation.isRepeated;
        
        delayFrames = new ArrayList<Double>();
        for(Double d : animation.delayFrames){
            delayFrames.add(d);
        }
        
        ignoreFrames = new ArrayList<Boolean>();
        for(boolean b : animation.ignoreFrames);{
            ignoreFrames.add(b);
    }
        
        frameImages = new ArrayList<FrameImage>();
        for(FrameImage f: animation.frameImages){
            frameImages.add(new FrameImage(f));
        }
    }
    
    
}
