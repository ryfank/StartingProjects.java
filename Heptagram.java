import Media.*;                
import java.awt.Color;     
                                                       */

public class Heptagram {
    
     private TurtleDisplayer display;
    private Turtle yertle; 
    
                                                      */
    
    public Heptagram ( ) {
         display = new TurtleDisplayer();
    yertle = new Turtle();
    display.placeTurtle(yertle);
    yertle.setSpeed(Turtle.SLOW);
    
    
    yertle.moveTo(0,0);
        yertle.penDown();
        
        
     for (int i = 1; i<=7; i++){
            
            yertle.forward(50);
            yertle.left(10*Math.PI/7);
            
        }
        
        yertle.penUp();
        
       
        
    }; 
    
    
    public static void main ( String[] args ) { Heptagram s = new Heptagram(); };
    
    
} // <className>
