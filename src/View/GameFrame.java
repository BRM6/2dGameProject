package View;

import javax.swing.*;

public class GameFrame extends JFrame {
    public static int frameWidth=900;
    public static int frameHeight=700;
    public GameFrame(){
        this.setBounds(0,0,frameWidth,frameHeight);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
