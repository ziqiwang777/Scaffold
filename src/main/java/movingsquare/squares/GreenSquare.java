
package movingsquare.squares;

import processing.core.PApplet;
import processing.core.PImage;


public class GreenSquare extends Square {

    private PImage img;

    public GreenSquare(PImage img, int x, int y, int width, int height, int[] velocity) {
        super(x, y, width, height, velocity);
        this.img = img;
    }
    
    public void tick() {
        this.x += velocity[0];
        this.y += velocity[1];
    }
    
    public void draw(PApplet app) {
        app.image(img, x, y, width, height);
        tick();
    }
    
    
}
