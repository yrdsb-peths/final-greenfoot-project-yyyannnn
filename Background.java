import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The background for the game
 * 
 * By Yan 
 */
public class Background extends Actor
{
    /**
     * Constructor for background 
     */
    public Background(){
        GreenfootImage image = new GreenfootImage("images/background1.jpg");
        image.scale(600,400);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
