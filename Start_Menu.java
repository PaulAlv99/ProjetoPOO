import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start_Menu extends World
{
    private final int DELTA=110;//valor que nao muda em vez de mudar em todo o lado
    /**
     * Constructor for objects of class Start_Menu.
     * 
     */
    
     private void placeObjects(){
        int worldWidth = getWidth();//vai buscar o comprimento do mundo(X)
        int worldHeight = getHeight();//vai buscar a altura do mundo(Y)
        
        //constroi os botoes
        Play play_button = new Play(worldWidth,worldHeight);
        Help help_button = new Help(worldWidth,worldHeight);
        
        //adiciona os botoes sabendo o nome do objeto e a localizacao em x e y
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
