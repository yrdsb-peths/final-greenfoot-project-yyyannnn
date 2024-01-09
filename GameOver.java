import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is for when the game is over 
 */
public class GameOver extends World
{
   
    /**
     * Constructor for objects of class GameOver world.
     * 
     */
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Background background = new Background();
        addObject(background,300,200);
        
        Target target = new Target();
        addObject(target,516,272);
        
        Label scoreLabel = new Label("Score: " + score,50);
        addObject(scoreLabel,105,50);
        
        GoBack back = new GoBack(3);
        addObject(back,31,371);
    }

    /**
     * If the user presses the space bar, it will return back to home screen 
     */
    public void act()
    {
    }
    
    /**
     * Set to titleScreen 
     */
    public void returnScreen()
    {
        TitleScreen homeScreen = new TitleScreen();
        Greenfoot.setWorld(homeScreen);
    }
    
}
