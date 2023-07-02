import java.awt.*;

public abstract class Point {
    protected static int x, y;

    public static int getX() {
        return x;
    }
    public static int getY() {
        return y;
    }

    public Point() {
        x = (int) (Math.random() * Scene.WIDTH) - Scene.WIDTH / 2;
        y = (int) (Math.random() * Scene.HEIGHT) - Scene.HEIGHT / 2;
    }
}
