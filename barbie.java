import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barbie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barbie extends Actor
{
    /**
     * Act - do whatever the barbie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento("D","A","S","W");
    }
    int velocidade=2;
    //Greenfoot.getRandomNumber(10);
    
    public void movimento(String key1,String key2,String key3,String key4){
        if(Greenfoot.isKeyDown(key1)){
            move(velocidade);//D
        }
        if(Greenfoot.isKeyDown(key2)){
            move(-velocidade);//A
        }
        if(Greenfoot.isKeyDown(key3)){
            setLocation(getX(), getY()+velocidade);//S
        }
        if(Greenfoot.isKeyDown(key4)){
            setLocation(getX(), getY()-velocidade);//W
        }
    }
}
