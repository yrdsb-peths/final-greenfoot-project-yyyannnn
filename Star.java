import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Star 
 */
public class Star extends Actor
{
    static GreenfootSound starSound = new GreenfootSound("star.mp3");
    
    //Creates the array for animation 
    GreenfootImage[] fillUp = new GreenfootImage[6];
    
    //SimpleTimer for animation
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor for Star
     */
    public Star()
    {
        //Loads the imagse 
        for (int i = 0; i < fillUp.length; i++)
        {
            fillUp[i] =  new GreenfootImage("images/Star_fill/star" + i + ".png");
            fillUp[i].scale(50,50);
        }
        
        animationTimer.mark();
        
        // Initial star
        setImage(fillUp[0]);
        
        starSound.play();
    }
    
    /**
     * Animation for star
     */
    int imageIndex = 0;
    public void animateStar()
    {
        //Controls how fast the animation goes 
        if(animationTimer.millisElapsed() < 90)
        {
           return; 
        }
        
        animationTimer.mark();
        
        //Animate until last image
        if(imageIndex == 5){
            setImage(fillUp[imageIndex]);
        }
        else{
            setImage(fillUp[imageIndex]);
            imageIndex = (imageIndex + 1) % fillUp.length;
        }
        
    }
    
    /**
     * Animates the star 
     */
    public void act()
    {
        animateStar();
    }
    
    
    /**
     * A static method that will set the volume of sound
     */
    public static void setVolume(int volume){
        starSound.setVolume(volume);
    }
}
