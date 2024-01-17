import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blue sparks
 * 
 * By Yan 
 */
public class BlueSparks extends Actor
{    
    //Creates the array for animation 
    GreenfootImage[] sparks = new GreenfootImage[9];
    
    //Properties
    int speed;
    int imageIndex = 0;
    
    //SimpleTimer for animation
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor for BlueSparks
     */
    public BlueSparks(int speed)
    {
        //Loads the images 
        for (int i = 0; i < sparks.length; i++)
        {
            sparks[i] =  new GreenfootImage("images/blue_spark/Bspark" + i + ".png");
            sparks[i].scale(125,125);
        }
        
        this.speed = speed;
        animationTimer.mark();
        
        // Initial spark
        setImage(sparks[0]);
    }
    
    /**
    * Animation for sparks
    */
    public void animateSparks()
    {
        //Controls how fast the animation goes 
        if(animationTimer.millisElapsed() < speed)
        {
           return; 
        }
        animationTimer.mark();
        
        GameWorld world = (GameWorld) getWorld();
        //Will animate every frame until the imageIndex equal 4 
        if(imageIndex == 4)
        {
            //If world is paused, it will setImage at the last image and remove itself 
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
        else
        {
            setImage(sparks[imageIndex]);
            imageIndex = (imageIndex + 1) % sparks.length;
        }
        
    }
    
    /**
     * Will animate the actor 
     */
    public void act()
    {
        animateSparks();
    }

}
