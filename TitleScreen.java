import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * What player will see when in the beginning.
 */

public class TitleScreen extends World
{

    Label titleLabel = new Label("Shooting Game",60);
    Arrow arrow = new Arrow();
    
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
        
        prepare();
        
    }
    
    /**
     * The main world act loop
     */
    public void act()
    {
        // Go to practice if user presses the space bar
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld practice = new MyWorld();
            Greenfoot.setWorld(practice);
        }
        
        //Play game if user presses enter
        if(Greenfoot.isKeyDown("enter"))
        {
            GameWorld gameWorld = new GameWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        if(Greenfoot.mouseClicked(null))
        {
            addObject(arrow,124,247);
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
        addObject(label,124,233);

        Label label2 = new Label("'space' to practice", 30);
        addObject(label2,114,353);

        Label label3 = new Label("Click to shoot", 30);
        addObject(label3,124,264);
        
        Label label4 = new Label("'enter' to play game", 30);
        addObject(label4,119,380);
        
        SoundButton soundButton = new SoundButton();
        addObject(soundButton,570,35);
    }
}
