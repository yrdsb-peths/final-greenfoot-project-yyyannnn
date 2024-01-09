import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoBack extends Actor
{
    GreenfootImage image;
    int world;
    
    /**
     * Contructor
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
        if(Greenfoot.mouseClicked(this))
        {
            if(world == 1)
            {
                MyWorld world = (MyWorld) getWorld();
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
