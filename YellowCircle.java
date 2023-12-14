import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YellowCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YellowCircle extends Actor
{
    public YellowCircle(int size)
    {
       GreenfootImage image = new GreenfootImage("images/yellow circle.png");
       image.scale(size,size);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the YellowCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
