import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCircle extends Actor
{
    public BlueCircle(int size)
    {
       GreenfootImage image = new GreenfootImage("images/blue circle.png");
       image.scale(size,size);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the BlueCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
