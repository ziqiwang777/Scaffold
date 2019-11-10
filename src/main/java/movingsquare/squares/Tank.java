package movingsquare.squares;

import processing.core.PApplet;
import processing.core.PImage;

public class Tank extends Square{
    private PImage img;


    int Damage_accout = 0;
    public Tank(PImage img,int x, int y, int width, int height, int[] velocity) {
        super(x, y, width, height, velocity);
        this.img = img;
    }

    public int[] getlocation(){
        return new int[]{x,y};
    }


    public void setDamage_accout(){
        Damage_accout += 1;

    }


//    public boolean islive(){
//        return  this.isalive;
//    }
//    public void setislive(boolean isalive){
//        this.isalive = isalive;
//    }


    public void move(int i) {
        this.x += i*velocity[0];
        if (this.x<180){
            this.x = 180;
        }else if(this.x>438){
            this.x = 438;
        };
    }


    @Override
    public void draw(PApplet app) {
        app.image(img, x, y, width, height);
    }
}
