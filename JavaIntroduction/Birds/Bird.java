import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bird is a bird.
 * 
 * @author Shikhar 
 * @version August 8
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        firePoopKey();// Add your action code here.
    }    
    
    public void checkKeys()
    {
        if ("space".equals(Greenfoot.getKey()));
        firePoopKey();
        if (Greenfoot.isKeyDown("up"))
        move(6);
        if (Greenfoot.isKeyDown("down"))
        move(-6);
        if (Greenfoot.isKeyDown("left"))
        turn(-6);
        if (Greenfoot.isKeyDown("right"))
        turn(6);
    }
    
    public void firePoopKey()
    {
        getWorld().addObject(new Poop(), getX(), getY());
        
    }
}
