import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class C extends Actor
{
    /**
     * Act - do whatever the C wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        Actor actor = getOneIntersectingObject(A.class);
        if(actor != null)
        {
            Greenfoot.stop();
        }

        switch( (int)(Math.random() * 4))
        {
            case 0:
                setRotation(0);
                move(40);
                break;
            case 1:
                setRotation(90);
                move(40);
                break;
            case 2:
                setRotation(180);
                move(40);
                break;
            case 3:
                setRotation(270);
                move(40);
                break;
        }
    }
}