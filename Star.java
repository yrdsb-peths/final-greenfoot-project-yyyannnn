import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class Star extends Actor
{
    //static GreenfootSound penguinSound = new GreenfootSound("penguinSound.mp3");
    GreenfootImage[] fillUp = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor 
     */
    public Star()
    {
        for (int i = 0; i < fillUp.length; i++)
        {
            fillUp[i] =  new GreenfootImage("images/Star_fill/star" + i + ".png");
            fillUp[i].scale(50,50);
        }
        
        animationTimer.mark();
        
        // Initial penguin
        setImage(fillUp[0]);
    }
    
    /**
     * Animation for star
     */
    int imageIndex = 0;
    public void animateStar()
    {
        if(animationTimer.millisElapsed() < 90)
        {
           return; 
        }
        animationTimer.mark();
        
        if(imageIndex == 5){
            setImage(fillUp[imageIndex]);
        }
        else{
            setImage(fillUp[imageIndex]);
            imageIndex = (imageIndex + 1) % fillUp.length;
        }
        
        
    }
    
    /**
     * 
     */
    public void act()
    {
        animateStar();
    }
    
    
    // /**
     // * A static method that will set the volume of sound
     // */
    // public static void setVolume(int volume){
        // penguinSound.setVolume(volume);
    // }
}
