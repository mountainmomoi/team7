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
<<<<<<< HEAD
        super(1280, 720, 1); 
        
        
        
        for(int i=0;i<5;i++){
            int A = 0;
            int B = 1280;
            int x = A + (int)(Math.random()*((B-A)+1));
            A=0;
            B=720;
            int y= A + (int)(Math.random()*((B-A)+1));
            addObject( new B(), x, y);
        }
=======
<<<<<<< HEAD
//<<<<<<< HEAD
        super(1280, 720, 1); 
        addObject(new A(), 640, 360);
        addObject(new C(), 300, 200);
//=======
        //super(1280, 800, 1);
        //addObject(new A(), 640, 360);
//>>>>>>> 26d66a46c604a0a50d2fff732435da2b9d7631d8
=======

        super(1280, 720, 1); 

        
        addObject(new A(),600,350);    
        addObject(new AIM(),600,450);  

        addObject(new C(), 300, 200);


>>>>>>> 01ce8036f3aafeb137fbc69f2e07084e0fb5aabb
>>>>>>> 0f71c0c4fc485e258789a49057ccf7f9f044f1f4
    }
}

