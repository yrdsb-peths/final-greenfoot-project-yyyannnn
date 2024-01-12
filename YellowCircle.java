import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Yellow ring for target 
 * 
 * By Yan
 */
public class YellowCircle extends Actor
{
    //Image
    GreenfootImage image;
    
    /**
     * Constructor for YellowCircle
     */
    public YellowCircle(int size)
    {
       image= new GreenfootImage("images/yellow circle.png");
       image.scale(size,size);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the YellowCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    
    /**
     * Sets the scale of the image 
     */
    public void setScale(int num)
    {
        image.scale(num,num);
    }
}
