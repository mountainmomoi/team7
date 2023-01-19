import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int wait = 0;
    public void act() 
    {

        if(Greenfoot.isKeyDown("d")) setLocation(getX()+3, getY());
        if(Greenfoot.isKeyDown("a")) setLocation(getX()-3, getY());
        if(Greenfoot.isKeyDown("s")) setLocation(getX(), getY()+3);
        if(Greenfoot.isKeyDown("w")) setLocation(getX(), getY()-3);
        
        if(wait > 0)
            wait--;
        if(Greenfoot.isKeyDown("space"))
            if(wait == 0){
                Shoot();
                wait = 30;
            }
    }
<<<<<<< HEAD
        
    private int charWidth = getImage().getWidth()-45;

    private void Shoot()
    {
        getWorld().addObject(new BULLET(getRotation()), getX()+charWidth,getY());
        
        MouseInfo mouse = Greenfoot.getMouseInfo(); 
         
        if (mouse != null) 
        {  
           turnTowards(mouse.getX(), mouse.getY());  
        }
        
        
    }    
}    

=======
}
>>>>>>> 861ca6efa9de4b1fc5892bc42f3dff4b7bda8837
