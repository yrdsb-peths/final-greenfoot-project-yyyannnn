import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackCircl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackCircle extends Actor
{
    GreenfootImage image;
    
    public BlackCircle(int size)
    {
       image = new GreenfootImage("images/black circle.png");
       image.scale(size,size);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the BlackCircl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void setScale(int num)
    {
        image.scale(num,num);
    }
}
