import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aim extends Actor
{
    GreenfootImage image;
    MouseInfo mouse;
    int x;
    int y;
    
    public Aim()
    {
       image = new GreenfootImage("images/aim.png");
       image.scale(5,5);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the Aim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null)
        {
          x = mouse.getX();
          y = mouse.getY();
          setLocation(x,y);  
        }
        
        
    }
}
