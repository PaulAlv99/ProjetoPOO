import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start_Menu extends World
{
    private final int DELTA=150;
    /**
     * Constructor for objects of class Start_Menu.
     * 
     */
    
     private void placeObjects(){
        int worldWidth = getWidth();
        int worldHeight = getHeight();
        Play play_button = new Play(worldWidth,worldHeight);
        Help help_button = new Help(worldWidth,worldHeight);
        
        addObject(play_button,
        worldWidth/2-DELTA,
        worldHeight/2
        );
        
        addObject(help_button,
        worldWidth/2+DELTA,
        worldHeight/2
        );
        
        
    }
    public Start_Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        placeObjects();
        
    }
}
