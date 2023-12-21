import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResultWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    WhiteCircle whiteCircle;
    BlackCircle blackCircle;
    BlueCircle blueCircle;
    RedCircle redCircle;
    YellowCircle yellowCircle;
    
    /**
     * Constructor for objects of class ResultWorld.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //createTarget();
        
        Background background = new Background();
        addObject(background,300,200);
        
        Target target = new Target();
        addObject(target,516,272);
        
        Label label = new Label("Press space to restart", 30);
        addObject(label,124,233);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            TitleScreen homeScreen = new TitleScreen();
            Greenfoot.setWorld(homeScreen);
        }
    }
    
    public void createTarget()
    {
        int x = getWidth()/2;
        int y = getHeight()/2;
        
        whiteCircle = new WhiteCircle(350);
        addObject(whiteCircle,x,y);
        
        blackCircle = new BlackCircle(300);
        addObject(blackCircle,x,y);
        
        blueCircle = new BlueCircle(250);
        addObject(blueCircle,x,y);
        
        redCircle = new RedCircle(200);
        addObject(redCircle,x,y);
        
        yellowCircle = new YellowCircle(100);
        addObject(yellowCircle,x,y);
    }
}
