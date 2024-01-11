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
    int starX = 560;
    boolean isPaused = false;
    int shootAnimation = 0;
    
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
        
        GoBack back = new GoBack(2);
        addObject(back,31,371);
        
        createRedcan();
        createSound();
    }
    
    public void act()
    {
       if(Greenfoot.mouseClicked(null))
       {
           if(shootAnimation == 1)
           {
              RedSparks spark = new RedSparks(50);
              addObject(spark,Aim.getXPix(),Aim.getYPix()); 
           }
           else if (shootAnimation == 2)
           {
               BlueSparks spark = new BlueSparks(250);
               addObject(spark,300,200);
           }
       }
       
       
    }
    
    /**
     * Go to game over world
     */    
    public void gameOver()
    {
        World world = new GameOver(score);
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
            
            starX -= 50;
            Star star = new Star();
            addObject(star,starX,30);
        
            if(score % 15 == 0)
            {
                isPaused = true;
                
                Chest chest = new Chest();
                addObject(chest,467,279);
                
                shootAnimation++;
                
                if(shootAnimation == 1)
                {
                    RedSparks spark = new RedSparks(500);
                    addObject(spark,300,200);
                }
                else if (shootAnimation == 2)
                {
                    BlueSparks spark = new BlueSparks(250);
                    addObject(spark,300,200);
                }
            }
        }
    }
    
    /**
     * Create can anywhere at the top of the screen
     */
    public void createRedcan(){
        if(isPaused)
        {
            return;
        }
        
        RedCan redCan = new RedCan();
        redCan.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(redCan,x,y);
    }
    
    public void setPaused(boolean bool)
    {
        isPaused = bool;
    }
    
    public boolean getPaused(){
        return isPaused;
    }
    
    /**
     * Create the sound button
     */
    public void createSound(){
        SoundButton soundButton = new SoundButton();
        addObject(soundButton,570,35);
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
