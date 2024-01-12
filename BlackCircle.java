import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Black ring for target 
 * 
 * By Yan
 */
public class BlackCircle extends Actor
{
    //Image
    GreenfootImage image;
    
    /**
     * Constructor for BlackCircle
     */
    public BlackCircle(int size)
    {
       image = new GreenfootImage("images/black circle.png");
       image.scale(size,size);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the BlackCircl wants to do. This method is called whenever
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
