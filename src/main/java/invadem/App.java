package invadem;

import processing.core.PApplet;

public class App extends PApplet {

    public App() {
        //Set up your objects
    }

    public void setup() {
        frameRate(60);
//        squares.add(new RedSquare(loadImage("red.png"), 0, 0, 50, 50, new int[] {0, 1}));


    }

    public void settings() {
        size(640, 480);
    }

    public void draw() { 
        //Main Game Loop
    }

    public static void main(String[] args) {

        PApplet.main("invadem.App");
        System.out.println("!!!!!!!!!!!!!");
    }

}
