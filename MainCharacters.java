import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCharacters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCharacters extends Actor
{
    private int jumpDelay = 10;
    private final int velocity=6;
    private int vSpeed = 0;
    private final int jumpHeight=-velocity*jumpDelay;
    private boolean spaceDown=false;
    private boolean isJumping = false;
    private int animationCounter = 0;
    private int frame;
    private boolean walking;
    private boolean facingRight;
    /**
     * Act - do whatever the MainCharacters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public MainCharacters(){
        /*quando o objeto é construido está parado*/
        walking = false;
        
        /* quando o objeto é construido está virado para a direita*/
        facingRight = true; 
    }
    public void act()
    {
        
    }
    public void animation_left(GreenfootImage[] img){
        /*Como a animacao é frames por segundo foi necessario fazer um delay para o
           movimento nao ser muito rapido, como sao cerca de 55/60 frames por segundo
           significa que em 11 frames ja está na segunda posicao img[1] e assim
           sucessivamente para as outras posicoes*/
        int delay = 10; 
        /*está a andar para a esquerda logo está virado para a esquerda*/
        facingRight = false; 
        walking=true;
        frame ++;
        
        if(frame < 1 * delay)
        {
            setImage(img[0]);
        }
        else if(frame < 2 * delay)
        {
            setImage(img[1]);
        }
        else if(frame < 3 * delay)
        {
            setImage(img[2]);
        }
        else if (frame < 4 * delay)
        {
            setImage(img[3]);
            frame = 1;
            return;
        }
    }   
        
    public void animation_right(GreenfootImage[] img){
        /*Mesma mecanica da funcao anterior so que em vez de ir para a esquerda
           vai para a direita*/
        int delay = 10;
        
        facingRight = true;
        walking=true;
        frame ++;
        if(frame < 1 * delay)
        {
            setImage(img[0]);
        }
        else if(frame < 2 * delay)
        {
            setImage(img[1]);
        }
        else if(frame < 3 * delay)
        {
            setImage(img[2]);
        }
        else if (frame < 4 * delay)
        {
            setImage(img[3]);
            frame = 1;
            return;
        }
    }
    public void movement(String key1, String key2, String key3, GreenfootImage[] img_right, GreenfootImage[] img_left) {
    boolean isKeyPressed = false;

    if (Greenfoot.isKeyDown(key1)) {
        move(velocity); // D
        animation_right(img_right);
        isKeyPressed = true;
        facingRight = true; // objeto fica virado para a direita
    } else if (Greenfoot.isKeyDown(key2)) {
        move(-velocity); // A
        animation_left(img_left); 
        isKeyPressed = true;
        facingRight = false; // objeto fica virado para a esquerda
    }
    /*Se está a ser pressionada a tecla para saltar é mudado o estado do spaceDown
       para true.Se o objeto estiver no chao(Ground.class) entao pode saltar
       sendo vSpeed uma valor negativo e depois é invocado a funcao para cair*/
    if (spaceDown != Greenfoot.isKeyDown(key3)) {//W
        spaceDown = !spaceDown;
        if (spaceDown && onGround(Ground.class))
            vSpeed = jumpHeight;
        fall(); 
    }
    /*Se nao estiver nenhum dos botoes de movimento a ser usado, entao
       o objeto nao está a andar. Se estiver virado para a direita fica com
       a imagem em que está parado para a direita caso contrario, a outra imagem
       virado para a esquerda*/
    if (!isKeyPressed) {
        walking = false;
        if (facingRight) {
            setImage(img_right[0]);
        } else {
            setImage(img_left[0]);
        }
    }
}

    private void fall()
    {
    /*vSpeed inicial é 0 mas como a funcao está sempre a ser chamada
     * para o objeto conseguir cair entao vSpeed está sempre a aumentar até chegar
       ao chao(Ground.class) usando o metodo isTouching para saber se finalmente o objeto
       chegou à plataforma*/
    setLocation(getX(),getY() + vSpeed);
    vSpeed = vSpeed + velocity;
    if(isTouching(Ground.class)){
        setLocation(getX(),getY() - 1);/*nao percebo o porquê do -1 o Tomas é que fez que explique*/
    }
    }
    boolean onGround(Class c)
   {
    /*nao percebo esta funcao o Tomas é que fez que explique*/
    Actor under = getOneObjectAtOffset(0,getImage ().getHeight()/2,c);
    return under!=null;
   }
   public void checkFalling()
   {
       /*nao percebo esta funcao o Tomas é que fez que explique*/
       if(onGround(Ground.class) == false)
       {
           fall();
       }
    }
    public void checkCollisionWithGround(Class c)
    {
     if (isTouching(c)){
     // Colisão com a classe Ground
    // Impede que o personagem "barbie" passe através da plataforma ao descer
     if(vSpeed>0){// Verifica se está descendo
      while (isTouching(c)){
          setLocation(getX(), getY() - 1);// Move o personagem para cima até que a colisão seja resolvida
          vSpeed = 0;// Impede o personagem de continuar a cair
          isJumping=false;
            }
         }
       }
    }
}