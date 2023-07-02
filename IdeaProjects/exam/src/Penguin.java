import java.awt.*;
public class Penguin extends Bird{
    public Penguin() {
        color = new Color(21, 5, 245);
    }
    public void draw(Graphics g){
        super.draw(g);
        g.setColor(color.WHITE);
    }
}