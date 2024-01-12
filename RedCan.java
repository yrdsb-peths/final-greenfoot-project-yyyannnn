import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main object for the game 
 * 
 * By Yan
 */
public class RedCan extends Actor
{
    //Image and Sound
    GreenfootImage image;
    static GreenfootSound hitSound = new GreenfootSound("ting.wav");
    
    //Properties 
    public int speed = 1;
    private boolean isHit = false;
    
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
        //Set location 
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        //Get a boolean from GameWorld
        GameWorld world = (GameWorld) getWorld();
        boolean isStopped = world.getPaused();
        
        if(isStopped)
        {
            speed = 50;
        }
        
        //Check if mouse clicked this object 
        if(Greenfoot.mouseClicked(this))
        {
            hitSound.play();
            speed = 10;
            isHit = true;
            
            //Will create itself and increases score when not isStopped 
            if(!isStopped)
            {
                world.createRedCan();
                world.increaseScore();
            }
        }

        // Remove object when it gets to bottom
        if(getY() >= world.getHeight())
        {
            if(!isHit && !isStopped)
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
    
    /**
     * A static method that will set the volume of sound
     */
    public static void setVolume(int volume){
        hitSound.setVolume(volume);
    }
}
