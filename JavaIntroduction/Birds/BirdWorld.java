import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdWorld extends World
{

    /**
     * Constructor for objects of class BirdWorld.
     * 
     */
    public BirdWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        setPaintOrder(new Class [] {Bird.class, Poop.class});
    }
}
