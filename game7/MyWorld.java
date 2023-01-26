import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 

        addObject(new C(), 300, 200);
        addObject(new A(), 640, 360);
        
        
        
        for(int i=0;i<5;i++){
            int A = 0;
            int B = 1280;
            int x = A + (int)(Math.random()*((B-A)+1));
            A=0;
            B=720;
            int y= A + (int)(Math.random()*((B-A)+1));
            addObject( new B(), x, y);
        }

        
        addObject(new C(), 300, 200);

        //super(1280, 800, 1);
        //addObject(new A(), 640, 360);


        

        
            
        addObject(new AIM(),600,450);  

        addObject(new C(), 300, 200);


    }
}

