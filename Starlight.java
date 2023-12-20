import Media.*;                 //the displayer
import static Media.Turtle.*;   //turtle speeds
import java.awt.*;               //colour and objects
import static java.lang.Math.*;  //math 
import static java.awt.Color.*;  //the colours                                                     */

public class Starlight{
  private TurtleDisplayer display;  
  private Turtle yertle;
  
 
  public Starlight() {
    yertle = new Turtle(1);
    //shortcut to turtle moving extremely fast
    display = new TurtleDisplayer();
    display.placeTurtle(yertle); 
    
    
    yertle.moveTo(-110,110); 
    //starting off placement
    
    drawCanvas();  
    //sky that lets all the stars get placed on the canvas        
    yertle.penUp();


    yertle.moveTo(0,0);    
    display.close(); 
    
    yertle.penDown();
  }
  
  private void drawCanvas(){  
    
      //method for relocating the stars and putting the placement of the stars 
      
    for (int i = 0; i< 4; i++) {  

      for (int j = 0; j < 4; j++) { 
        drawStars();  
        yertle.penUp();  
        yertle.forward(75); 
        //brings the stars together
      }
      yertle.penUp(); 
      yertle.backward (300); //fits all stars on center of canvas 
      yertle.right (Math.PI/2);
      yertle.forward(80); //fair spacing out the stars( doesn't jumble them up)
      yertle.left(Math.PI/2); 
      yertle.penDown();
      
    }        
    
    //nested loop piecing the diamonds made by the ray to stars together
    
    
  }
  private void drawStars(){ 

    int min = 4; //min of star sides of the stars
    int max = 7; // max of star sides of the stars

    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min); 
    //making the random placement of stars
      for(int r = 0; r< random_int; r++) {
      drawDiamond();
      yertle.right((2*Math.PI)/random_int);
      //looping the randomization and creating random stars
    
    }
  }  
  private void drawDiamond(){  
    //this method creates the diamond to create stars aka the math process
    yertle.penDown(); 
    yertle.right(Math.PI/4); 
    yertle.forward(21.2);       
    yertle.left(Math.PI/2.4); 
    yertle.forward(30); 
    
    yertle.left(Math.PI/1.5);
    yertle.forward(30); 
    yertle.left(Math.PI/2.4); 
    yertle.forward(21.2); 
    yertle.right(Math.PI/4);
    
    yertle.right(Math.PI); 
    //returns the turtle back to where it started 
    
  }
  
  public static void main ( String[] args ) { Starlight s = new Starlight(); };
}