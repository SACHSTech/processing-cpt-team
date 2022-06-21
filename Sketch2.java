//backup two electric boogaloo
import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class Sketch2 extends PApplet {
	
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
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    imgButtonL = loadImage("img_714112.png");
    imgButtonL.resize(50,50);
    imgButtonR = loadImage("img_714111.png");
    imgButtonR.resize(50,50);
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
    }
    if (screen == 4) {
      slide4();
    }
    if (screen == 5) {
      slide5();
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
      //from here
      else {
        fill(255); // Black
        rect(530, 135, 40, 20);
      }

    }

  public void slide2() {
    background(255,255,255);
    image(imgButtonL, 21, 195);
    image(imgButtonR, 525, 195);

    fill(0); // Black
    textSize(40);
    text("never gonna let you down", 25, 150);

    if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 210 && mouseY <= 230)) { {
      fill(0); // black
      rect(25, 210, 40, 20);

      if (mousePressed == true) {
        screen = 1; // Changes the screen to slide 1
      }
    }
  }
    else {
      fill(255);
      rect(25, 210, 40, 20);
    }

    if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 210 && mouseY <= 230)) { {
      fill(0); // black
      rect(530, 210, 40, 20);

      if (mousePressed == true) {
        screen = 3; // Changes the screen to slide 3
      }
    }
  }
    else {
      fill(255); // orange
      rect(530, 210, 40, 20);
    }
}
  
  public void slide3() {
    background(255, 0, 0);
    image(imgButtonL, 21, 270);
    image(imgButtonR, 525, 270);

    fill(0, 0, 0); // Black
    textSize(40);
    text("never gonna run around", 25, 150);

    if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 285 && mouseY <= 305)) { {
      fill(0); // black
      rect(25, 285, 40, 20);

      if (mousePressed == true) {
        screen = 2; // Changes the screen to slide 2
      }
    }
  }
    else {
      fill(255); // orange
      rect(25, 285, 40, 20);

    }

    if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 285 && mouseY <= 305)) { {
      fill(0); // black
      rect(530, 285, 40, 20);

      if (mousePressed == true) {
        screen = 4; // Changes the screen to slide 4
      }
    }
  }
    else {
      fill(255);
      rect(530, 285, 40, 20);
    }
}

public void slide4() {
  background(255);
  image(imgButtonL, 21, 345);
  image(imgButtonR, 525, 345);

  fill(0, 0, 0); // Black
  textSize(40);
  text("and", 25, 150);

  if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 360 && mouseY <= 380)) { {
    fill(0); // black
    rect(25, 360, 40, 20);

    if (mousePressed == true) {
      screen = 3; // Changes the screen to slide 2
    }
  }
}
  else {
    fill(255); // orange
    rect(25, 360, 40, 20);

  }

  if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 360 && mouseY <= 380)) { {
    fill(0); // black
    rect(530, 360, 40, 20);

    if (mousePressed == true) {
      screen = 5; // Changes the screen to slide 4
    }
  }
}
  else {
    fill(255);
    rect(530, 360, 40, 20);
  }
}

public void slide5() {
  background(255);
  image(imgButtonL, 21, 420);

  fill(0, 0, 0); // Black
  textSize(40);
  text("desert you", 25, 150);

  if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 435 && mouseY <= 455)) {
    fill(0); // black
    rect(25, 435, 40, 20);

    if (mousePressed == true) {
      screen = 4; // Changes the screen to slide 5
    }
  }
  else {
    fill(255); // orange
    rect(25, 435, 40, 20);

  }
}
  // technology advancements for pictures and texts

  //public void mousePressed() {
    //boolMouseClick = true;
  //}

}
  
