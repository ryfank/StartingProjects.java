import Media.*;                  
import java.awt.Color;               




public class Wreath {
    
     private TurtleDisplayer display;
    private Turtle yertle; 
        
    public Wreath ( ) {
        
    display = new TurtleDisplayer();
    yertle = new Turtle();
    display.placeTurtle(yertle);
    yertle.setSpeed(Turtle.FAST);
     
    //big loop rotation
    
    
    for (int i = 1; i<= 20; i++){

        yertle.moveTo(0,0); 
          
        
        yertle.right(Math.PI/10);
        yertle.forward(80);
        
            yertle.penDown(); 
                  
         //code for heptagram nested loop
        for (int j = 1; j<=7; j++){
              
            yertle.forward(50);
            yertle.left(10*Math.PI/7);
            
        }
    
        
        yertle.penUp();
        
        
        
    }
    
      
        
    };                                                             

    
    
    public static void main ( String[] args ) { Wreath s = new Wreath (); };

    
    
}  