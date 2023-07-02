import java.awt.*;
import java.util.Scanner;
public class Bird {
    Scanner in = new Scanner(System.in);
    protected int x, y;
    protected static int cnt = 0;
    protected static int cirx, ciry, r;

    public boolean polina(int cirx, int ciry, int r, int x, int y) {
        if (Math.sqrt((ciry - y) * (ciry - y) + (cirx - x) * (cirx - x)) <= r) {
            return true;
        }
        else{
            return false;
        }
    }
    protected int size;
    protected Color color;
    public static void polina2(int crx,int cry,int rod){
        cirx = crx;
        ciry = cry;
        r = rod;
    }
    public Bird() {
        x = (int) (Math.random() * Scene.WIDTH);
        y = (int) (Math.random() * Scene.HEIGHT);
        size = 20;
        color = new Color(211, 9, 88);
        if (polina(cirx,ciry,r,x,y) == true) {
            cnt++;
        }
    }
   public void draw (Graphics g){
        g.setColor(Color.ORANGE);
        g.drawOval(cirx-r,ciry-r,r+r,r+r);
        g.setColor(color);
        g.fillOval(x - size/2, y - size/2, size, size);
    }
}