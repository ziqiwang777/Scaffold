package movingsquare.squares;

import processing.core.PApplet;
import processing.core.PImage;

import javax.swing.*;

public class Invader extends Square {

    private PImage img;

    private boolean isalive;
    public Invader(PImage img,int x, int y, int width, int height, int[] velocity) {
        super(x, y, width, height, velocity);
        this.img = img;
        this.isalive = true;

    }

    public int getY(){
        return this.y;
    }
    public int[] getLocation(){
        return new int[]{x,y};
    }
    public void setAlive(boolean islive){
        this.isalive = islive;
    }

    public boolean isAlive(){
        return this.isalive;
    }

    public void automove(int hor_move,int down_move){
        this.x += hor_move*velocity[0];
        this.y += down_move*velocity[1];

    }

    public void setImg(PImage img2){
        this.img = img2;
    }

    @Override
    public void draw(PApplet app) {
        app.image(img, x, y, width, height);

    }
}
