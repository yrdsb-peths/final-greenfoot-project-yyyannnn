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
    GreenfootImage image;
    boolean isHit = false;
    static GreenfootSound hitSound = new GreenfootSound("ting.wav");
    
    /**
     * Contructor
     */
    public RedCan(){
        image = new GreenfootImage("images/red_can.png");
        image.scale(40,70);
        setImage(image);
        isHit = false;
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
        
        GameWorld world = (GameWorld) getWorld();
        
        if(Greenfoot.mouseClicked(this))
        {
            hitSound.play();
            speed = 10;
            isHit = true;
            world.createRedcan();
            world.increaseScore();
        }

        // Remove oject when it gets to bottom
        if(getY() >= world.getHeight())
        {
            if(!isHit)
            {
                world.gameOver();
            }
            
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
