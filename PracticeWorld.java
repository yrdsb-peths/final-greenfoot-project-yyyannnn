import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is for practice.
 * 
 * By Yan
 */
public class PracticeWorld extends World
{
    //Objects 
    WhiteCircle whiteCircle;
    BlackCircle blackCircle;
    BlueCircle blueCircle;
    RedCircle redCircle;
    YellowCircle yellowCircle;
    Aim aim;
    Label scoreLabel;
    Label shotsLabel;
    
    //Properties 
    public int score = 0;
    public int shots = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PracticeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Background background = new Background();
        addObject(background,300,200);
        
        //Create objects 
        createTarget();
        
        aim = new Aim(false);
        addObject(aim,getWidth()/2,210);
        
        scoreLabel = new Label("Score: " + score, 50);
        addObject(scoreLabel,100,100);
        
        shotsLabel = new Label("Shots: " + shots, 50);
        addObject(shotsLabel,100,61);
        
        // Bow bow = new Bow();
        // addObject(bow,386,186);
        
        SoundButton soundButton = new SoundButton();
        addObject(soundButton,570,35);
        
        GoBack back = new GoBack(1);
        addObject(back,31,371);
    }
    
    /**
     * Method that the World will always check 
     */
    public void act()
    {
        //Check where the mouse clicked 
        checkArrow();
        
        //Check for mouse info 
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        //Create black spots when mouse clicks 
        if(Greenfoot.mouseClicked(null) && mouse != null)
        {            
            BlackCircle spot = new BlackCircle(2,true);
            addObject(spot,mouse.getX(),mouse.getY());
            
            addShots();
        }
    }
    
    /**
     * Will add score when clicked on circles
     */
    public void checkArrow()
    {        
        if(Greenfoot.mouseClicked(yellowCircle)){
            addScore(40);
        }
        
        if(Greenfoot.mouseClicked(redCircle)){
            addScore(30);
        }
        
        if(Greenfoot.mouseClicked(blueCircle)){
            addScore(20);
        }
        
        if(Greenfoot.mouseClicked(blackCircle)){
            addScore(10);
        }
        
        if(Greenfoot.mouseClicked(whiteCircle)){
            addScore(5);
        }
    }
    
    /**
     * Method to add score and change scoreLabel
     */
    public void addScore(int s)
    {
        score += s;
        scoreLabel.setValue("Score: " + score);
    }
    
    /**
     * Method to add number of shots and change shotsLabel
     */
    public void addShots()
    {
        shots++;
        shotsLabel.setValue("Shots: " + shots);
    }
      
    /**
     * Creates the target
     */
    public void createTarget()
    {
        int x = getWidth()/2;
        int y = 210;

        whiteCircle = new WhiteCircle(50);
        addObject(whiteCircle,x,y);
        
        blackCircle = new BlackCircle(40, false);
        addObject(blackCircle,x,y);
        
        blueCircle = new BlueCircle(30);
        addObject(blueCircle,x,y);
        
        redCircle = new RedCircle(20);
        addObject(redCircle,x,y);
        
        yellowCircle = new YellowCircle(10);
        addObject(yellowCircle,x,y);
        
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
