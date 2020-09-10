import View.GameFrame;
import View.GamePanel;

public class test {
    public static void main(String[] args) {
        System.out.println("test");
        GameFrame g=new GameFrame();
        g.add(new GamePanel());
        g.revalidate();
    }
}
