import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Buttom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void resize_butt(int width,int height){
        GreenfootImage image = getImage();  
        image.scale(width, height);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
