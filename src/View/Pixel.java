package View;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;

public class Pixel extends Rectangle {
    Color color;
    public static final int sideLength=5;

    public static LinkedHashSet<Pixel> randomPixels(int width,int length){
        int numOfPixelWidth=width/sideLength;
        int numOfPixelLength=length/sideLength;
        Random r=new Random();
        LinkedHashSet<Pixel> res=new LinkedHashSet<>();
        for (int i = 0; i <numOfPixelWidth ; i++) {
            for (int j = 0; j <numOfPixelLength ; j++) {
                Color c=new Color(r.nextInt(250),r.nextInt(250),r.nextInt(250));
                Pixel p=new Pixel(i*sideLength,j*sideLength,c);
                res.add(p);
            }
        }
        return res;
    }


    public Pixel(int x, int y,Color color) {
        super(x, y, sideLength, sideLength);
        this.color = color;
    }

    public Pixel(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pixel p=(Pixel)o;
        return p.x == x && p.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
