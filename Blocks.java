import greenfoot.*;
/**
 * Write a description of class Blocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blocks extends Actor  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Blocks
     */
    public Blocks()
    {
        getImage().scale(getImage().getWidth(),getImage().getHeight());
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
