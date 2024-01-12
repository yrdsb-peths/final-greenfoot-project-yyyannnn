import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Red ring for target 
 * 
 * By Yan
 */
public class RedCircle extends Actor
{
    //Image
    GreenfootImage image;
    
    /**
     * Constructor for RedCircle
     */
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
    
    /**
     * Sets the scale of the image 
     */
    public void setScale(int num)
    {
        image.scale(num,num);
    }
}
