import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause extends Button
{
    /**
     * Act - do whatever the Pause wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean paused;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
           pausa_parar();
           
        }
        if((Greenfoot.mouseClicked(this)&&(paused))){
            //como quando está pausa nao é possivel carregar no pause do cenario
        }
    }
    public void pausa_parar(){
        Greenfoot.stop();
        paused=true;
    }
}
