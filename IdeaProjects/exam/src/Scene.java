import javax.management.BadBinaryOpValueExpException;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Scene extends JFrame {
    private Group birds;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public Scene(Group birds){
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Birds");
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.birds = birds;
    }
    public void paint(Graphics g) {
        birds.draw(g);
    }
}
