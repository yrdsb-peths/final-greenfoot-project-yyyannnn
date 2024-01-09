import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aim extends Actor
{
    // MyWorld world = (MyWorld) getWorld();
    private GreenfootImage image;
    private MouseInfo mouse;
    public static int x;
    public static int y;
    public int bodyMovement = 5;
    private boolean isGame;
    
    static GreenfootSound whooshSound = new GreenfootSound("whoosh.mp3");
    
    public Aim(boolean game)
    {
       image = new GreenfootImage("images/aim.png");
       image.scale(5,5);
       setImage(image); 
       isGame = game;
    }
    
    /**
     * Act - do whatever the Aim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
   
        if (Greenfoot.mouseClicked(null))
        {
            whooshSound.play();
            return;
        }
        else
        {
           checkMouse();
        }
    
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
    
    public static int getXPix()
    {
        return x;
    }
    
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
