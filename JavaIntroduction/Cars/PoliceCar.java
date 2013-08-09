import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PoliceCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PoliceCar extends Actor
{
    /**
     * Act - do whatever the PoliceCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("w"))
        move(6);
        if (Greenfoot.isKeyDown("s"))
        move(-6);
        if (Greenfoot.isKeyDown("a"))
        turn(-4);
        if (Greenfoot.isKeyDown("d"))
        turn(4);
    }

    public PoliceCar()
    {
        getImage().scale(100,50);
    }

    public boolean atWorldEdge()
    {
        if (getX() < 10 || getY() < 10 || getX() > 990 || getY() > 990)
        {return true;}
        return false;
    }
}
