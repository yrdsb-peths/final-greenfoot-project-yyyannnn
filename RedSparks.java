import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class RedSparks extends Actor
{
    //static GreenfootSound starSound = new GreenfootSound("star.mp3");
    GreenfootImage[] sparks = new GreenfootImage[5];
    SimpleTimer animationTimer = new SimpleTimer();
    int speed;
    
    /**
     * Constructor 
     */
    public RedSparks(int speed)
    {
        for (int i = 0; i < sparks.length; i++)
        {
            sparks[i] =  new GreenfootImage("images/Sparks/spark" + i + ".png");
            sparks[i].scale(150,150);
        }
        
        this.speed = speed;
        animationTimer.mark();
        
        // Initial chest
        setImage(sparks[0]);
        
        //starSound.play();
    }
    
    /**
     * Animation for sparks
     */
    int imageIndex = 0;
    public void animateSparks()
    {
        if(animationTimer.millisElapsed() < speed)
        {
           return; 
        }
        animationTimer.mark();
        
        GameWorld world = (GameWorld) getWorld();
        if(imageIndex == 4){
            
            if(world.getPaused())
            {
                setImage(sparks[imageIndex]);
                
                world.removeObject(this);
                
                Greenfoot.delay(120);
                
            }
            else
            {
                world.removeObject(this);
            }
        }
        else{
            setImage(sparks[imageIndex]);
            imageIndex = (imageIndex + 1) % sparks.length;
        }
        
    }
    
    /**
     * 
     */
    public void act()
    {
        animateSparks();
    }
    
    
    // /**
     // * A static method that will set the volume of sound
     // */
    // public static void setVolume(int volume){
        // starSound.setVolume(volume);
    // }
}
