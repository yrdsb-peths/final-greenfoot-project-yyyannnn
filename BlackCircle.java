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
    
    //Properties
    boolean ifRemove;
    SimpleTimer timer = new SimpleTimer();
    
    /**
     * Constructor for BlackCircle
     */
    public BlackCircle(int size, boolean remove)
    {
       image = new GreenfootImage("images/black circle.png");
       image.scale(size,size);
       setImage(image);  
       ifRemove = remove;
       
       if(ifRemove)
       {
           timer.mark();
       }
    }
    
    /**
     * Act - do whatever the RedCircle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(ifRemove)
        {
            if(timer.millisElapsed() > 3000)
            {
               PracticeWorld world = (PracticeWorld) getWorld();
               world.removeObject(this);
               timer.mark();
            }
        }
    }
    
    /**
     * Sets the scale of the image 
     */
    public void setScale(int num)
    {
        image.scale(num,num);
    }
}
