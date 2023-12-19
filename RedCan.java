import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCan extends Actor
{
    public int speed = 1;
    
    /**
     * Contructor
     */
    public RedCan(){
        GreenfootImage image = new GreenfootImage("images/red_can.png");
        image.scale(40,70);
        setImage(image);
    }
        
    /**
     * Act - do whatever the RedCan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        // Game over when it gets to bottom
        GameWorld world = (GameWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            //world.gameOver();
            world.removeObject(this);
        }
    }
    
    /**
     * Sets the speed of moving downward 
     */
    public void setSpeed(int spd){
        speed = spd;
    }
}
