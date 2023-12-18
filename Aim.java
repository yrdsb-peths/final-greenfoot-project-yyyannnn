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
    
    
    public Aim()
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
        
          if (Greenfoot.mouseClicked(null))
          {
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
        
}
