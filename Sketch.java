import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgButtonL;
  PImage imgButtonR;
  PImage imgPicture1;
  PImage imgPicture2;
  PImage imgPicture3;

  PImage imgPicture5;
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
    imgButtonL = loadImage("img_714112.png");
    imgButtonL.resize(50,50);
    imgButtonR = loadImage("img_714111.png");
    imgButtonR.resize(50,50);

    imgPicture1 = loadImage("https://cdn.pocket-lint.com/r/s/1200x630/assets/images/120309-phones-news-buyer-s-guide-best-smartphones-image66-camkvh2lyz.jpg");
    imgPicture1.resize(imgPicture1.width/2,imgPicture1.height/2);

    imgPicture2 = loadImage("https://www.iplocation.net/assets/images/blog/featured/tcp-ip.jpg");
    imgPicture2.resize(485,166);

    imgPicture3 = loadImage("https://cdn-images-1.medium.com/max/2600/1*Ggoe0CCCsTvO_Kg6f7dgEA.png");
    imgPicture3.resize(imgPicture3.width/4,imgPicture3.height/4);

    imgPicture5 = loadImage("https://policyoptions.irpp.org/wp-content/uploads/sites/2/2021/10/Wordpress-Canadas-fledgling-cybersecurity-centre-must-do-more-collaborating-and-educating.jpg");
    imgPicture5.resize(imgPicture5.width/4,imgPicture5.height/4);
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
    image(imgPicture1, 27, 50);

      fill(0); // 
      textSize(23);
      text("Smartphones", 30, 34);
      textSize(17);
      text("From the day they debuted, mobile phones have been evolving.", 30, 400);
      text("Over the past 20 years, the following aspects of mobile devices", 30, 430);
      text("have undergone significant changes:", 30, 450);
      text("- style and appearance                    - size", 30, 490);
      text("- function size                                  - image/camera technology", 30, 520);
      text("- larger full-screen displays             - photography processors", 30, 550);

      if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 135 && mouseY <= 155)) {
        if (mousePressed == true) { 
          screen = 2; // Changes the screen to slide 2
        }
      }
    }

  public void slide2() {
    background(200);
    image(imgButtonL, 21, 195);
    image(imgButtonR, 525, 195);
    image(imgPicture2, 60, 18);

    fill(0); // Black
    textSize(37);
    text("TCP/IP", 240, 237);
    textSize(18);
    text("Before the introduction of TCP/IP, it used to be difficult to", 28, 295);
    text("connect different computers.", 28, 325);
    text("It plays a major role in the current world of contemporary", 28, 355);
    text("technology, and is the basic unit or language for communication", 28, 385);
    text("on the internet. This can also be applied to private internet,", 28, 415);
    text("like Ethernet and so on.", 28, 445);
    textSize(14);
    text("The IP is directly responsible for obtaining internet addresses and then it is the work of", 28, 485);
    text("TCP to deliver the data obtained to the addresses obtained by IP. When this address is", 28, 510);
    text("delivered again and again, a chain of communication is created.", 28, 535);

    if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 210 && mouseY <= 230)) { {
      if (mousePressed == true) {
        screen = 1; // Changes the screen to slide 1
      }
    }
  }

    if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 210 && mouseY <= 230)) { {
      if (mousePressed == true) {
        screen = 3; // Changes the screen to slide 3
      }
    }
  }
}
  
  public void slide3() {
    background(200);
    image(imgButtonL, 21, 270);
    image(imgButtonR, 525, 270);
    image(imgPicture3, 60, 26);

    fill(0, 0, 0); // Black
    textSize(40);
    text("AI", 280, 311);
    textSize(19);
    text("In the last five years, the field of AI has made major progress", 27, 365);
    text("in almost all its standard sub-areas, including vision, speech", 27, 395);
    text("recognition and generation, natural language processing", 27, 425);
    text("(understanding and generation), image and video generation,", 27, 455);
    text("multi-agent systems, planning, decision-making, and integration", 27, 485);
    text("of vision and motor control for robotics.", 27, 515);

    if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 285 && mouseY <= 305)) { {
      if (mousePressed == true) {
        screen = 2; // Changes the screen to slide 2
      }
    }
  }

    if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 285 && mouseY <= 305)) { {
      if (mousePressed == true) {
        screen = 4; // Changes the screen to slide 4
      }
    }
  }
}

  public void slide4() {
    background(200);
    image(imgButtonL, 21, 345);
    image(imgButtonR, 525, 345);

    fill(0, 0, 0); // Black
    textSize(40);
    text("and", 25, 150);

    if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 360 && mouseY <= 380)) { {
      if (mousePressed == true) {
        screen = 3; // Changes the screen to slide 3
      }
    }
  }

    if ((mouseX >= 530 && mouseX <= 569) && (mouseY >= 360 && mouseY <= 380)) { {

      if (mousePressed == true) {
        screen = 5; // Changes the screen to slide 5
      }
    }
  }
}

  public void slide5() {
    background(200);
    image(imgButtonL, 21, 420);
    image(imgPicture5, 60, 26);

    fill(0, 0, 0); // Black
    textSize(40);
    text("desert you", 25, 150);

    if ((mouseX >= 25 && mouseX <= 68) && (mouseY >= 435 && mouseY <= 455)) {
      if (mousePressed == true) {
        screen = 4; // Changes the screen to slide 4
      }
    }
  }

  // technology advancements for pictures and texts

}
  
