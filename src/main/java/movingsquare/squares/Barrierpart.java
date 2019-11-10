package movingsquare.squares;

import processing.core.PApplet;
import processing.core.PImage;


public class Barrierpart extends Square {
    PImage[] img;
    int Damage_count;
    public Barrierpart(PImage[] img, int x, int y, int width, int height, int[] velocity) {
        super(x, y, width, height, velocity);
        this.img = img;
        this.Damage_count = 0;
    }

    public void setDamage_count(){
        Damage_count +=1;
        if (Damage_count>3){
            Damage_count = 3;
        }
    }

    public int getDamage_count(){
        return Damage_count;
    }


    public int[] getLocation(){
        return new int[]{x,y};
    }

    @Override
    public void draw(PApplet app) {


        app.image(img[Damage_count], x, y, width, height);
    }


}
