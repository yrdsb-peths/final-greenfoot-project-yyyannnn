import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    WhiteCircle whiteCircle;
    BlackCircle blackCircle;
    BlueCircle blueCircle;
    RedCircle redCircle;
    YellowCircle yellowCircle;
    Aim aim;
    Label scoreLabel;
    
    MouseInfo mouse = Greenfoot.getMouseInfo();
    
    public int windVer = Greenfoot.getRandomNumber(10);
    public int windHor = Greenfoot.getRandomNumber(10);
    public int score = 0;
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Background background = new Background();
        addObject(background,300,200);
        
        //createTarget();
        createTarget();
        
        aim = new Aim();
        addObject(aim,getWidth()/2,210);
        
        scoreLabel = new Label("Score: " + score, 50);
        addObject(scoreLabel,100,100);
        
    }
    
    
    public void act(){
        if(Greenfoot.mouseClicked(null))
        {
        
            if(mouse != null)
            {
                System.out.println("hi");
                BlackCircle spot = new BlackCircle(10);
                addObject(spot,mouse.getX(),mouse.getY());
            }
            
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

    }
    
    public void addScore(int s){
        score += s;
        scoreLabel.setValue("Score: " + score);
    }
    
    public void createTarget()
    {
        int x = getWidth()/2;
        int y = 210;
        
        whiteCircle = new WhiteCircle(50);
        addObject(whiteCircle,x,y);
        
        blackCircle = new BlackCircle(40);
        addObject(blackCircle,x,y);
        
        blueCircle = new BlueCircle(30);
        addObject(blueCircle,x,y);
        
        redCircle = new RedCircle(20);
        addObject(redCircle,x,y);
        
        yellowCircle = new YellowCircle(10);
        addObject(yellowCircle,x,y);
    }
}
