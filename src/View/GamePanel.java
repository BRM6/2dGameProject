package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class GamePanel extends JPanel {
    Image image;
    public GamePanel(){
        this.setBounds(0,0,GameFrame.frameWidth,GameFrame.frameHeight);
        this.setBackground(Color.black);
        image=new Image();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        image.draw(g2d);
    }


}
