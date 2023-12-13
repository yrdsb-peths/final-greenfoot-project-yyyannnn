import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    WhiteCircle whiteCircle;
    BlackCircle blackCircle;
    BlueCircle blueCircle;
    RedCircle redCircle;
    YellowCircle yellowCircle;
    Aim aim;
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Background background = new Background();
        addObject(background,300,200);
        
        createTarget();
        
        aim = new Aim();
        addObject(aim,getWidth()/2,210);
        
    }
    
    public void createTarget()
    {
        whiteCircle = new WhiteCircle();
        addObject(whiteCircle,getWidth()/2,210);
        
        blackCircle = new BlackCircle();
        addObject(blackCircle,getWidth()/2,210);
        
        blueCircle = new BlueCircle();
        addObject(blueCircle,getWidth()/2,210);
        
        redCircle = new RedCircle();
        addObject(redCircle,getWidth()/2,210);
        
        yellowCircle = new YellowCircle();
        addObject(yellowCircle,getWidth()/2,210);
    }
}
