import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help_Menu extends World
{

    /**
     * Constructor for objects of class Help_Menu.
     * 
     */
    private final int DELTA=60;
     private void placeObjects(){
        int worldWidth = getWidth();
        int worldHeight = getHeight();
        Back pause_button = new Back(worldWidth,worldHeight);
        
        addObject(pause_button,
        DELTA,
        DELTA-20
        );
    }
    public Help_Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        placeObjects();
    }
}
