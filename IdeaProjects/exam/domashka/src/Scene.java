import javax.swing.*;
import java.awt.*;

public class Scene extends JFrame {
    private Group birds;

    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    public Scene(Group birds){
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Birds");
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); // --> paint(g)

        this.birds = birds;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        g.translate(WIDTH/2, HEIGHT/2); //Перенос начала координат в центр окна.
        g.drawLine(-WIDTH/2, 0, WIDTH/2, 0);
        g.drawLine(0, HEIGHT/2, 0, -HEIGHT/2);

        //g.setColor(new Color(255, 0, 0));
        //g.drawLine(0, 0, 40, 40);
        //g.drawOval(40, 40, 80, 80);
        //g.setColor(Color.ORANGE);
        //g.fillOval(220, 220, 80, 80);

        birds.draw(g);
    }

}
