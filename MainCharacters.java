import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCharacters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCharacters extends Actor
{
    int velocity=1;
    private int vSpeed = 0;
    private int jumpHeight=-20;
    private int jumpDelay = 10;
    private boolean spaceDown;
    private boolean isJumping = false;
    
    /**
     * Act - do whatever the MainCharacters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        
    }
    
    public void movement(String key1,String key2,String key3){
        
        if(Greenfoot.isKeyDown(key1)){
            move(velocity);//D
        }
        if(Greenfoot.isKeyDown(key2)){
            move(-velocity);//A
        }
        if(spaceDown != Greenfoot.isKeyDown(key3)){
            spaceDown = ! spaceDown;
            if (spaceDown && onGround())
                vSpeed=jumpHeight;
                fall();//W
                
        }
    }

    private void fall()
    {
    setLocation(getX(),getY() + vSpeed);
    vSpeed = vSpeed + velocity;
    if(isTouching(Ground.class)){
        setLocation(getX(),getY() - 1);
    }
    }
    boolean onGround()
   {
    Actor under = getOneObjectAtOffset(0,getImage ().getHeight()/2,Ground.class);
    return under!=null;
   }
   public void checkFalling()
   {
       if(onGround() == false)
       {
           fall();
       }
    }
    public void checkCollisionWithGround()
    {
     if (isTouching(Ground.class)){
     // Colisão com a classe Ground
    // Impede que o personagem "barbie" passe através da plataforma ao descer
     if(vSpeed>0){// Verifica se está descendo
      while (isTouching(Ground.class)){
          setLocation(getX(), getY() - 1);// Move o personagem para cima até que a colisão seja resolvida
          vSpeed = 0;// Impede o personagem de continuar a cair
          isJumping=false;
            }
         }
       }
    }
}