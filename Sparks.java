import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class Sparks extends Actor
{
    //static GreenfootSound starSound = new GreenfootSound("star.mp3");
    GreenfootImage[] sparks = new GreenfootImage[5];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor 
     */
    public Sparks()
    {
        for (int i = 0; i < sparks.length; i++)
        {
            sparks[i] =  new GreenfootImage("images/Sparks/spark" + i + ".png");
            sparks[i].scale(150,150);
        }
        
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
        if(animationTimer.millisElapsed() < 90)
        {
           return; 
        }
        animationTimer.mark();
        
        if(imageIndex == 4){
            setImage(sparks[imageIndex]);
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
