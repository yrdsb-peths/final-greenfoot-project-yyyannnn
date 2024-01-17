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
    public int move = 0;
    private boolean isRight = true;
    
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
        
        Bow bow = new Bow();
        addObject(bow,386,186);
        
        //Create objects 
        createTarget();
        
        aim = new Aim(false);
        addObject(aim,getWidth()/2,210);
        
        scoreLabel = new Label("Score: " + score, 50);
        addObject(scoreLabel,100,100);
        
        shotsLabel = new Label("Shots: " + shots, 50);
        addObject(shotsLabel,100,61);
    
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
        
        moveTarget();      
    }

    /**
     * Move the target
     */
    public void moveTarget()
    {        
        int y = 210;
        int x;
        
        if(isRight)
        {
            x = yellowCircle.getX() + move;
            
            if(yellowCircle.getX() >= 599)
            {
                isRight = false;
            }
        }
        else
        {
            x = yellowCircle.getX() - move;
            
            if(yellowCircle.getX() <= 1)
            {
                isRight = true;
            }
        }
        
        yellowCircle.setLocation(x,y);
        whiteCircle.setLocation(x,y);
        blackCircle.setLocation(x,y);
        blueCircle.setLocation(x,y);
        redCircle.setLocation(x,y);
    }
    
    /**
     * Will add score when clicked on circles
     */
    public void checkArrow()
    {        
        if(Greenfoot.mouseClicked(yellowCircle)){
            addScore(40);
        }
        else if(Greenfoot.mouseClicked(redCircle)){
            addScore(30);
        }
        else if(Greenfoot.mouseClicked(blueCircle)){
            addScore(20);
        }
        else if(Greenfoot.mouseClicked(blackCircle)){
            addScore(10);
        }
        else if(Greenfoot.mouseClicked(whiteCircle)){
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
        
        if(shots % 10 == 0)
        {
            move++;
        }
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
