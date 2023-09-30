import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Counter actCounter;
    private int timeElapsed; // contar conjuntos de ciclos 55 e depois 55 o que equivale a 1s a 1s
    private int timeCounter; // contar ate 55(cada ciclo)
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
        actCounter = new Counter("Tempo: ");
        addObject(actCounter, 1000, 28);
        Ground plataforma = new Ground();
        addObject(plataforma, 400, 500); // X, Y
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to te world.
     */
    private void prepare()
    {

        barbie barbie = new barbie();
        addObject(barbie,146,113);
        ken ken = new ken();
        addObject(ken,929,468);

        Pause pause = new Pause();
        addObject(pause,1077,28);
    }
    
    public void act()
    {
        timeCounter = (timeCounter+1)%55;
            if (timeCounter == 0)
            {
                timeElapsed++;

            }
            actCounter.setValue(timeElapsed + 1);
    }

    
    
}

