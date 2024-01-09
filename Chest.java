import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class Chest extends Actor
{
    //static GreenfootSound starSound = new GreenfootSound("star.mp3");
    GreenfootImage[] chest = new GreenfootImage[9];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor 
     */
    public Chest()
    {
        for (int i = 0; i < chest.length; i++)
        {
            chest[i] =  new GreenfootImage("images/Chest_open/chest" + i + ".png");
            chest[i].scale(150,150);
        }
        
        animationTimer.mark();
        
        // Initial chest
        setImage(chest[0]);
        
        //starSound.play();
    }
    
    /**
     * Animation for chest
     */
    int imageIndex = 0;
    public void animateChest()
    {
        if(animationTimer.millisElapsed() < 110)
        {
           return; 
        }
        animationTimer.mark();
        
        if(imageIndex == 8){
            setImage(chest[imageIndex]);
        }
        else{
            setImage(chest[imageIndex]);
            imageIndex = (imageIndex + 1) % chest.length;
        }
        
    }
    
    /**
     * 
     */
    public void act()
    {
        animateChest();
    }
    
    
    // /**
     // * A static method that will set the volume of sound
     // */
    // public static void setVolume(int volume){
        // starSound.setVolume(volume);
    // }
}
