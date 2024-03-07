import processing.core.PApplet;
import java.util.Random;
public class Sketch extends PApplet {
	
  /**
   * A program Sketch.java that is design to make a flower!
   * @author : Simon Tse
   */

   // Make variables
  Random myRandom = new Random();
  int intRandom1X, intRandom1Y, intRandom2X, intRandom2Y;
  

  public void settings() {
	// Size of the drawing
    size(600, 600);

  // Store random numbers
  intRandom1X = myRandom.nextInt(200);
  intRandom1Y = myRandom.nextInt(200);
  intRandom2X = myRandom.nextInt(200);
  intRandom2Y = myRandom.nextInt(200);
  }

  public void setup() {

  // Initial Colour of the background
    background(184, 211, 255);

  }

  public void draw() {

	  // Colour change for backrgound
    boolean colourChange1 = intRandom1X >= 90 && intRandom1Y >= 90;
    if (colourChange1) {
      background(171, 249, 255);
   }
    else {
      background(184, 211, 255);
    }
   
  // Initial Stem Colour
    strokeWeight (30);
    stroke (42, 130, 22);

  // Colour Change of the Stem
  boolean colourchange4 = intRandom1Y >= 100;
    if (colourchange4) {

      stroke (117, 255, 102);
    }
  // Stem Position
    line (300 + intRandom2X,300 + intRandom2Y, 300 + intRandom2X, 550 + intRandom2Y);

  // Initial Petal Colour
    strokeWeight (1);
    stroke (0);
    fill (235, 156, 255);
    
  // Variable Colour change of petals
  boolean colourChange2 = intRandom2X >= 150 || intRandom2Y <= 50;
    if (colourChange2) {
      fill (255, 169, 41);
  }

  // Petal Positions
    ellipse (250 + intRandom2X, 250 + intRandom2Y, 100, 100); 
    ellipse (350 + intRandom2X, 350 + intRandom2Y, 100, 100);
    ellipse (250 + intRandom2X, 350 + intRandom2Y, 100, 100);
    ellipse(350 + intRandom2X, 250 + intRandom2Y, 100, 100);

  // Middle section of flower
    strokeWeight (1);
    stroke (0);
    fill( 255, 234, 0);
    ellipse(300 + intRandom2X, 300 + intRandom2Y, 100, 100);

  // Initial Colour of the Sun
    fill( 255, 234, 0);

  // Colour Change of the sun
  boolean colourChange3 = intRandom2X >100;
    if (colourChange3) {
      fill (255, 41, 134);
    }

  // Positioning of the sun
    ellipse(100 + intRandom1X, 100 + intRandom1Y, 50, 50);
    triangle(105 + intRandom1X, 130 + intRandom1Y, 95 + intRandom1X, 130 + intRandom1Y, 100 + intRandom1X, 150 + intRandom1Y);
    triangle(105 + intRandom1X, 70 + intRandom1Y, 95 + intRandom1X, 70 + intRandom1Y, 100 + intRandom1X, 50 + intRandom1Y);
    triangle(130 + intRandom1X, 105 + intRandom1Y, 130 + intRandom1X, 95 + intRandom1Y, 150 + intRandom1X, 100 + intRandom1Y);
    triangle(70 + intRandom1X, 105 + intRandom1Y, 70 + intRandom1X, 95 + intRandom1Y, 50 + intRandom1X, 100 + intRandom1Y);
    triangle(75 + intRandom1X, 85 + intRandom1Y, 85 + intRandom1X, 75 + intRandom1Y, 65 + intRandom1X, 65 + intRandom1Y);
    triangle(125 + intRandom1X, 85 + intRandom1Y, 115 + intRandom1X, 75 + intRandom1Y, 135 + intRandom1X, 65 + intRandom1Y);
    triangle(75 + intRandom1X, 115 + intRandom1Y, 85 + intRandom1X, 125 + intRandom1Y, 65 + intRandom1X, 135 + intRandom1Y) ;
    triangle(125 + intRandom1X, 115 + intRandom1Y, 115 + intRandom1X, 125 + intRandom1Y, 135 + intRandom1X, 135 + intRandom1Y);

  // Current Time + colour
    boolean colourChange5 = (int)second() % 2 <= 0; 
    if (colourChange5) {
      fill (57, 74, 189);
    }
    else {
      fill (255, 0, 136);
    }
      
    textSize(20);
    text("Current Time: " + hour() + ":" + minute() + ":" + second(), 10, 50);

  




 
  }
}
  
