import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An Arrow that only appears in titleScreen 
 * 
 * @By Yan 
 */
public class Arrow extends Actor
{
    //Image 
    GreenfootImage arrow;
    
    /**
     * Constructor for arrow 
     */
    public Arrow()
    {
         arrow = new GreenfootImage("images/arrow.png");
         arrow.scale(200,60);
         setImage(arrow);
    }
    
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX() + 3;
        int y = getY();
        
        //Make the arrow stops when it hit the target 
        if(x >= 396)
        {
           setLocation(getX(),getY()); 
        }
        else
        {
            setLocation(x,y);
        }
    }
}
