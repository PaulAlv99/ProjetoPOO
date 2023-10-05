import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ken extends barbie
{
    /**
     * Act - do whatever the ken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento("right","left","up");
        checkFalling();
        checkCollisionWithGround();
        checkCollisionWhithBloco();
    }
}
