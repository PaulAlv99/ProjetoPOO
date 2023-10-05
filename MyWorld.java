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
        getBackground().setColor(new Color(135,206,235));
        getBackground().fill();
        prepare();
        actCounter = new Counter("Tempo: ");
        addObject(actCounter, 1000, 28);
        addObject(new Ground(), 0, 666); // X, Y
        addObject(new Ground(), 100, 666);
        addObject(new Ground(), 200, 666);
        addObject(new Ground(), 300, 666);
        addObject(new Ground(), 400, 666);
        addObject(new Ground(), 500, 666);
        addObject(new Ground(), 600, 666);
        addObject(new Ground(), 700, 666);
        addObject(new Ground(), 800, 666);
        addObject(new Ground(), 900, 666);
        addObject(new Ground(), 1000, 666);
        addObject(new Ground(), 1100, 666);
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

