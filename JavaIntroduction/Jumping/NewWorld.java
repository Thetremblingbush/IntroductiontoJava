import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewWorld extends World
{

    /**
     * Constructor for objects of class NewWorld.
     * 
     */
    public NewWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Jumper jumper = new Jumper();
        addObject(jumper, 282, 382);
        jumper.setLocation(284, 375);
    }
}
