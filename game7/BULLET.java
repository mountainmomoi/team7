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
        Actor c = getOneIntersectingObject(C.class);
        if(c != null){
         getWorld().removeObject(c);
         //getWorld().addObject( new C(), 300, 200);
        }
        Actor b = getOneIntersectingObject(B.class);
        if(b != null){
         getWorld().removeObject(b);
         //getWorld().addObject( new C(), 300, 200);
        }
        
        if(isAtEdge())
            getWorld().removeObject(this);
        setRotation(direction);
        move(speed);
    }
    
}
