import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the GameWorld.
 * 
 * By: Yan
 */
public class GameWorld extends World
{
    //Objects      
    Aim aim;
    Label scoreLabel;
    Label levelLabel;
    
    //Properties  
    public int score = 0;
    public int level = 1;
    private int starX = 560;
    public boolean isPaused = false;
    public int shootAnimation = 0;
    
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
        
        GoBack back = new GoBack(2);
        addObject(back,31,371);
        
        // Create a labels
        scoreLabel = new Label("Score: " + score,50);
        addObject(scoreLabel,90,38);
        
        levelLabel = new Label("Level: " + level,50);
        addObject(levelLabel,90,77);
        
        //Create Objects to start game 
        createRedCan();
        createSound();
    }
    
    /**
     * Method that the World will always check 
     */
    public void act()
    {
       //Check for mouse clicks 
       if(Greenfoot.mouseClicked(null))
       {
           //Depends on the shootAnimation, it will create different sparks wherever the mouse clicks 
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
     * Go to GameOver world
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
        
        //Everytime score increase by 5, level increases 
        if (score % 5 == 0)
        {
            level++;
            levelLabel.setValue("Level: " + level);
            
            //Creates a star everytime level increases
            starX -= 50;
            Star star = new Star();
            addObject(star,starX,30);
            
            //Everytime score increase by 15, there's a chest for the player 
            if(score % 15 == 0)
            {
                isPaused = true;
                
                Chest chest = new Chest();
                addObject(chest,467,279);
                
                shootAnimation++;
                
                //Depends on the shootAnimation, it will create different sparks
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
    public void createRedCan(){
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
    
    /**
     * Setter for isPaused 
     */    
    public void setPaused(boolean bool)
    {
        isPaused = bool;
    }
    
    /**
     * Getter for isPaused 
     */
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
