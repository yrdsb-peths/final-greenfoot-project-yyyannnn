import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An Actor that the player can click on to go back to TitleScreen
 * 
 * By Yan 
 */
public class GoBack extends Actor
{
    //Image
    GreenfootImage image;
    
    //Properties 
    int world;
    
    /**
     * Contructor for GoBack
     */
    public GoBack(int num){
        image = new GreenfootImage("images/back.png");
        image.scale(40,40);
        setImage(image);
        
        world = num;
    }
    
    /**
     * Act - do whatever the GoBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Check for mouse clicks 
        if(Greenfoot.mouseClicked(this))
        {
            //Calls returnScreen from the world that it is in 
            if(world == 1)
            {
                PracticeWorld world = (PracticeWorld) getWorld();
                world.returnScreen();
            }
            else if(world == 2)
            {
                GameWorld world = (GameWorld) getWorld();
                world.returnScreen();
            }
            else if (world == 3)
            {
                GameOver world = (GameOver) getWorld();
                world.returnScreen();
            }
        }
    }
}
