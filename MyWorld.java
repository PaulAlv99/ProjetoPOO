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
    private int timeElapsed; // saber os segundos decorridos
    private int timeCounter; // contar ate 55(cada ciclo)
    final int DELTA=20;
    
    private void placeObjects(){
        int worldWidth = getWidth();
        int worldHeight = getHeight();
        int DELTA_PLAT=10;
        
        getBackground().setColor(new Color(135,206,235));
        getBackground().fill();
        
        actCounter = new Counter("Tempo: ");
        addObject(actCounter, worldWidth/2, worldHeight/20);
        Barbie barbie = new Barbie();
        addObject(barbie,worldWidth-100,(worldWidth/2)-DELTA-10);
        Ken Ken = new Ken();
        addObject(Ken,worldWidth-300,(worldWidth/2)-DELTA-10);
        Pause pause = new Pause();
        addObject(pause,1077,28);
        
        /*colocar plataformas no fundo do mapa,contudo não está muito bom
         * é melhor saber o tamanho das plataformas para fazer os calculos
         * corretos e nao ter plataformas sobrepostas
         */
        for(int i=0;i<140;i++){
        addObject(new Ground(),
        worldWidth-DELTA_PLAT,
        worldHeight
        );
        DELTA_PLAT+=10;
        }
        
    }
        
    
    public MyWorld()
    {    
        // Create a new world with 110x600 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        prepare();
        placeObjects();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to te world.
     */
    private void prepare()
    {

    }
    
    public void act()
    {
        countframes();
    }
    /* count frames and increment to the seconds*/
    private void countframes(){
        timeCounter = (timeCounter+1)%55;
            if (timeCounter == 0)
            {
                timeElapsed++;

            }
            actCounter.setValue(timeElapsed + 1);
    }
    
    
}

