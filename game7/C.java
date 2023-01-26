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
            World game = new GAMEOVER();
            Greenfoot.setWorld( game );
        }
        
        switch( (int)(Math.random() * 8))
        {
            case 0:
                setRotation(0);
                move(20);
                break;
            case 1:
                setRotation(45);
                move(20);
                break;
            case 2:
                setRotation(90);
                move(20);
                break;
            case 3:
                setRotation(135);
                move(20);
                break;
            case 4:
                setRotation(180);
                move(20);
                break;
            case 5:
                setRotation(225);
                move(20);
                break;
            case 6:
                setRotation(270);
                move(20);
                break;
            case 7:
                setRotation(315);
                move(20);
                break;    
            case 8:
                setRotation(360);
                move(20);
                break;        
        }
    }
}