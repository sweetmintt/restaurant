import java.awt.*;

    public class Bird { //Модификаторы доступа (класс, переменная, метод): по умолчанию, public, private, protected
        private static int count = 0; //переменная класса

        protected int size;
        protected Color color;

        public Bird() { //Конструктор.
            count++;
            System.out.println("Я птица.");
            System.out.println("Нас уже " + count + " птиц.");
            size = 10;
            //color = Color.BLACK;
            color = new Color(0, 0, 0);
        }

        public void fly() { //Метод экземпляра класса.
            System.out.println("Я лечу!");
        }

        public static void printCount() { //Метод класса.
            System.out.println("Количество птиц:" + count);
        }

       /* public void draw(Graphics g) {
            int x = Point.getX();
            int y = Point.getY();
            g.setColor(color);
            g.fillOval( x- size / 2, -y - size / 2, size, size);
        }*/
    }

