import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class B extends Actor
{
    /**
     * Act - do whatever the B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

            Actor actor = getOneIntersectingObject(A.class);
            if(actor != null){
                World game = new GAMEOVER();
                Greenfoot.setWorld( game );
            }
            
            switch( (int)(Math.random() * 4)){
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
   
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
        }
    }    
}
