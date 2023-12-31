import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    Aim aim;
    public int score = 0;
    Label scoreLabel;
    Label levelLabel;
    int level = 1;
    //int numEggs = 0;
    
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        create();
    }
    
    /**
     * Create game objects
     */
    public void create()
    {
        Background background = new Background();
        addObject(background,300,200);
        
        aim = new Aim(true);
        addObject(aim,getWidth()/2,210);
        
        // Create a labal
        scoreLabel = new Label("Score: " + score,50);
        addObject(scoreLabel,90,38);
        
        levelLabel = new Label("Level: " + level,50);
        addObject(levelLabel,90,77);
        
        createRedcan();
        //createSound();
    }
    
    public void act()
    {
        
    }
    
    /**
     * Go to game over world
     */    
    public void gameOver()
    {
        World world = new GameOver();
        Greenfoot.setWorld(world);
    }
    
    /**
     * Increases score and level
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue("Score: " + score);
        
        if (score % 5 == 0)
        {
            level++;
            levelLabel.setValue("Level: " + level);
            //numEggs++;
            
            // for(int i = 0; i < numEggs; i++)
            // {
                // createEgg();
            // }
        }
    }
    
    /**
     * Create can anywhere at the top of the screen
     */
    public void createRedcan(){
        RedCan redCan = new RedCan();
        redCan.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(redCan,x,y);
    }
    
    /**
     * Create egg anywhere at the top of the screen
     */
    // public void createEgg(){
        // Egg egg = new Egg();
        // int x = Greenfoot.getRandomNumber(600);
        // int y = 0;
        // addObject(egg,x,y);
    // }
    
    // /**
     // * Create the sound button
     // */
    // public void createSound(){
        // SoundButton soundButton = new SoundButton();
        // addObject(soundButton,570,35);
    // }
}
