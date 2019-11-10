package movingsquare.squares;

import processing.core.PApplet;

public abstract class Square {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int[] velocity;
    
    public Square(int x, int y, int width, int height, int[] velocity) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = velocity;
    }
    
    public abstract void draw(PApplet app);
}
