import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AIM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AIM extends Actor
{
    /**
     * Act - do whatever the AIM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean mseBtnDown;
    private int mseX, mseY;
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        // updatting button state
        if (!mseBtnDown && Greenfoot.mousePressed(null)) mseBtnDown = true;
        if (mseBtnDown && Greenfoot.mouseClicked(null)) mseBtnDown = true;
        // for button down state
        if (mseBtnDown)
        {
            // updating mouse position
            if (mouse != null)
            {
                mseX = mouse.getX();
                mseY = mouse.getY();
            }
            // moving
            setLocation(mseX, mseY);
            setRotation(0);
            
           
        }
    }    
}
