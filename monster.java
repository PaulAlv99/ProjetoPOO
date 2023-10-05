import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monster extends Actor
{
    /**
     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=4;
    int count=0;
    public monster()
    {
        getImage().scale(30,30);
    }
    
    public void monster_movement()
    {
        if(count<100)
        setLocation(getX() +speed,getY());
        else
        {
            speed=-speed;
            count=0;
        }
    }
    public void act()
    {
        count++;
        monster_movement();
    }
}
