import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barbie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Barbie extends MainCharacters
{
    public GreenfootImage[] AnimationMotion_barbie_right =
    {
        new GreenfootImage("standing_barbie.png"),
        new GreenfootImage("2.png"),
        new GreenfootImage("3.png"),
        new GreenfootImage("4.png")
    };
    public GreenfootImage[] AnimationMotion_barbie_left =
    {
        new GreenfootImage("standing_barbie.png"),
        new GreenfootImage("2.png"),
        new GreenfootImage("3.png"),
        new GreenfootImage("4.png")
    };
    
        
    /**
     * Act - do whatever the Barbie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     
    public Barbie(){
        AnimationMotion_barbie_left[0].mirrorHorizontally();
        AnimationMotion_barbie_left[1].mirrorHorizontally();
        AnimationMotion_barbie_left[2].mirrorHorizontally();
        AnimationMotion_barbie_left[3].mirrorHorizontally();
    }
 
    public void act()
    {
        movement("D","A","W",AnimationMotion_barbie_right,AnimationMotion_barbie_left);
        checkFalling();
        checkCollisionWithGround(Ground.class);
    }

}