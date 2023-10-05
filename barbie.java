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
        movimento("D","A","W");
        checkFalling();
        checkCollisionWithGround();
        checkCollisionWhithBloco();
    }
    int velocidade=2;
    private int vSpeed = 0;
    private int jumpHeight=-4;
    private int jumpDelay = 10;
    private boolean isJumping = false;
    private boolean spaceDown;
    //Greenfoot.getRandomNumber(10);
    public void movimento(String key1,String key2,String key3){
        if(Greenfoot.isKeyDown(key1)){
            move(velocidade);//D
        }
        if(Greenfoot.isKeyDown(key2)){
            move(-velocidade);//A
        }
        if(Greenfoot.isKeyDown(key3)){
            vSpeed=jumpHeight;
            fall();
        }
        
}
    
    private void fall()
    {
    setLocation(getX(),getY() + vSpeed);
    vSpeed = vSpeed + velocidade;
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
       else{
           vSpeed=0;
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
    public void checkCollisionWhithBloco()
    {
        if(isTouching(Bloco.class)){
            if(vSpeed>0){
                while(isTouching(Bloco.class)){
                    setLocation(getX(),getY()-1);
                    vSpeed=0;
                    isJumping=false;
                }
            }
        }
    }
}

  