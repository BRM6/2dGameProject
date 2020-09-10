package View;

import java.awt.*;
import java.util.LinkedHashSet;

public class Image {
    int width;
    int height;
    int layer=0;
    LinkedHashSet<Pixel> pixels;

    public Image(int width, int height, int layer) {
        this(width,height);
        this.layer = layer;
    }

    public Image(int width, int height) {
        this();
        this.width = width;
        this.height = height;
    }

    public Image() {
        this.pixels = Pixel.randomPixels(GameFrame.frameWidth,GameFrame.frameHeight);
    }

    public void draw(Graphics2D g2d) {
        for (Pixel p : pixels) {
            g2d.draw(p);
            g2d.setColor(p.color);
            g2d.fillRect(p.x,p.y,Pixel.sideLength,Pixel.sideLength);
        }
    }


}
