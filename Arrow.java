import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    GreenfootImage arrow;
    
    public Arrow()
    {
         arrow = new GreenfootImage("images/arrow.png");
         arrow.scale(200,60);
         setImage(arrow);
    }
    
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX() + 3;
        int y = getY();
        
        if(x >= 396)
        {
           setLocation(getX(),getY()); 
        }
        else
        {
            setLocation(x,y);
        }
    }
}
