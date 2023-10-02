import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blocl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bloco extends Actor
{
    /**
     * Act - do whatever the blocl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bloco(int height,int widht)
    {
        getImage().scale(height,widht);
    }

    public void act()
    {
        // Add your action code here.
    }
}
