import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class DeathBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathBrick extends Brick
{

    public DeathBrick()
    {
        GreenfootImage image = new GreenfootImage(40, 20);
        image.setColor(Color.blue);
        image.fillRect(0, 0, 40, 20);
        image.setColor(Color.black);
        image.fillOval(10, 2, 20, 8);
        setImage(image);
    }

}