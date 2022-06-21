//backup

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class Sketch1 extends PApplet {
	
  PImage imgButtonL;
  PImage imgButtonR;
  PImage imgBackground3;
  boolean boolMouseClick = false;

  int screen = 1;
  

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    imgButtonL = loadImage("img_714112.png");
    imgButtonL.resize(60,60);
    imgButtonR = loadImage("img_714111.png");
    imgButtonR.resize(60,60);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    if (screen == 1) {
      slide1();
    }
    if (screen == 2) {
      slide2();
    }
    if (screen == 3) {
      slide3();


      if (mousePressed == true) {
        screen = 1;
      }

    }

}
  
public void slide1() {
  background(200);
  image(imgButtonR, 525, 120);

    fill(255); // White
    textSize(40);
    text("never gonna give you up", 25, 150);

    if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 135 && mouseY <= 155)) {
      fill(0, 255, 0); // Green
      rect(530, 135, 40, 20);
      
      if (mousePressed == true) { 
        screen = 2; // Changes the screen to slide 2
      }
    }
    else {
      fill(255); // Black
      rect(530, 135, 40, 20);
    }

  }

      


  public void slide2() {
    background(0);
  }
  
  public void slide3() {
    background(255);
  }
  // technology advancements for pictures and texts

  public void mousePressed() {
    boolMouseClick = true;
  }

}
  
