package movingsquare.squares;

import processing.core.PApplet;
import processing.core.PImage;

public class Projectile extends Square {

    PImage img;
    boolean fromtank;
    int dir;
    public Projectile(PImage img,int x, int y, int width, int height, int[] velocity) {
        super(x, y, width, height, velocity);
        this.img = img;
    }




    public boolean isfromtank(){
        return this.fromtank;
    }

    public void setDir(int dir){
        this.dir = dir;
        if(this.dir>0){
            this.fromtank = false;
        }else {
            this.fromtank = true;

        }
    }
    public int[] getLocation(){
        return new int[]{x,y};
    }
    public void move(){

        this.y += this.dir * velocity[1];
        System.out.println("x:" + this.x + " y ; "+this.y);

    }

    @Override
    public void draw(PApplet app) {
        app.image(img, x, y, width, height);
    }
}
