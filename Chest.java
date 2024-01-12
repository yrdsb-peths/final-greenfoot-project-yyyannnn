import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Chest - surprise for players
 */
public class Chest extends Actor
{
    //static GreenfootSound chestSound = new GreenfootSound("star.mp3");
    
    //Creates the array for animation 
    GreenfootImage[] chest = new GreenfootImage[9];
    
    //SimpleTimer for animation
    SimpleTimer animationTimer = new SimpleTimer();
    
    //Properties 
    int imageIndex = 0;
    
    /**
     * Constructor for Chest
     */
    public Chest()
    {
        //Loads the images 
        for (int i = 0; i < chest.length; i++)
        {
            chest[i] =  new GreenfootImage("images/Chest_open/chest" + i + ".png");
            chest[i].scale(150,150);
        }
        
        animationTimer.mark();
        
        // Initial chest
        setImage(chest[0]);
        
        //chestSound.play();
    }
    
    /**
     * Animation for chest
     */
    public void animateChest()
    {
        //Controls how fast the animation goes 
        if(animationTimer.millisElapsed() < 300)
        {
           return; 
        }
        
        animationTimer.mark();
        
        //Will animate every frame until the imageIndex equal 8
        if(imageIndex == 8){
            //SetImage at the last image, remove itself and continues the game
            
            setImage(chest[imageIndex]);
            
            GameWorld world = (GameWorld) getWorld();
            world.removeObject(this);
            
            world.setPaused(false);
            world.createRedCan();
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
        // chestSound.setVolume(volume);
    // }
}
