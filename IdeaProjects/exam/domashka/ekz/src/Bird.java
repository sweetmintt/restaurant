import java.awt.*;

public abstract class Bird { //Модификаторы доступа (класс, переменная, метод): по умолчанию, public, private, protected
    private static int count = 0; //переменная класса

    protected int x, y;
    protected static int r;
    protected int size;
    protected Color color;

    public static void circle(int rad) {
        r = rad;
    }
    public Bird() { //Конструктор.
        /*count++;
        System.out.println("Я птица.");
        System.out.println("Нас уже " + count + " птиц.");
*/
        x = (int) (Math.random() * Scene.WIDTH) - Scene.WIDTH / 2;
        y = (int) (Math.random() * Scene.HEIGHT) - Scene.HEIGHT / 2;

        size = 10;
        //color = Color.BLACK;
        color = new Color(0, 0, 0);
    }

    /* public void fly(){ //Метод экземпляра класса.
         System.out.println("Я лечу!");
     }

     public static void printCount(){ //Метод класса.
         System.out.println("Количество птиц:" + count);
     }
 */
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(x - r / 2, -y - r / 2, r + r, r + r);
        g.setColor(color);
        g.fillOval(x - size / 2, -y - size / 2, size, size);
    }
}