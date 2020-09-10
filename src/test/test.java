package test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class test {
    public static void main(String[] args) {
        LinkedHashSet<Obj> lh=new LinkedHashSet<>();
        for (int i = 0; i <3 ; i++) {
            lh.add(new Obj(i*2,i*5));
        }
        System.out.println(lh.add(new Obj(0,0)));

        Iterator<Obj> it=lh.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
class Obj{
    int x,y;

    public Obj(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return x == obj.x &&
                y == obj.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Obj{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
