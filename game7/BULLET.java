import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BULLET here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BULLET extends Actor
{
    private int direction,speed;
    public BULLET(int rotation)
    {
        direction = rotation; //passing value
        speed = 15;
        
    }
    public void act() 
    {
        if(isAtEdge())
            getWorld().removeObject(this);
        setRotation(direction);
        move(speed);
    }
    
}
