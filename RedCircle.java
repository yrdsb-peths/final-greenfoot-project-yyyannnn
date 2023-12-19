import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCircle extends Actor
{
    GreenfootImage image;
    
    public RedCircle(int size)
    {
       image = new GreenfootImage("images/red circle.png");
       image.scale(size,size);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the RedCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void setScale(int num)
    {
        image.scale(num,num);
    }
}
