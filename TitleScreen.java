import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * What player will see when in the beginning.
 */

public class TitleScreen extends World
{

    Label titleLabel = new Label("Archery",60);
    Label author = new Label("By Yan", 25);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Background background = new Background();
        addObject(background,300,200);
        
        addObject(titleLabel, getWidth()/2, 92);
        addObject(author,getWidth()/2,130);
        
        prepare();
        
    }
    
    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Target target = new Target();
        addObject(target,516,272);
        
        Label label = new Label("Move mouse to aim", 30);
        addObject(label,177,293);

        Label label2 = new Label("Press 'space' to start game", 30);
        addObject(label2,getWidth()/2,328);

        Label label3 = new Label("Click to shoot", 30);
        addObject(label3,421,291);
    }
}
