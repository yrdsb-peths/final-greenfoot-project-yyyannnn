import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aim is an object that follows wherever the mouse goes 
 * 
 * By Yan 
 */
public class Aim extends Actor
{
    //Properties 
    private MouseInfo mouse;
    public static int x;
    public static int y;
    public int bodyMovement = 5;
    
    //image and sound 
    private GreenfootImage image;
    static GreenfootSound whooshSound = new GreenfootSound("whoosh.mp3");
    
    /**
     * Constructor for Aim 
     */
    public Aim(boolean game)
    {
       image = new GreenfootImage("images/aim.png");
       image.scale(5,5);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the Aim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Check if mouse is clicked 
        if (Greenfoot.mouseClicked(null))
        {
            whooshSound.play();
        }
        
        //Checks the mouse 
        checkMouse();
    }

    
    public void checkMouse(){
        mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null)
        {
          x = mouse.getX() + Greenfoot.getRandomNumber(bodyMovement);
          y = mouse.getY() + + Greenfoot.getRandomNumber(bodyMovement);
          setLocation(x,y);  
        }
        
    }
    
    /**
     * Getter for variable x
     */
    public static int getXPix()
    {
        return x;
    }
    
    /**
     * Getter for variable x
     */
    public static int getYPix()
    {
        return y;
    }
    
    /**
     * A static method that will set the volume of sound
     */
    public static void setVolume(int volume){
        whooshSound.setVolume(volume);
    }
}
