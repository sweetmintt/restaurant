import java.awt.*;

public class Penguin extends Bird{
    private static int count = 0;

    public Penguin(){
        color = new Color(250, 10, 10);
        count++;
        System.out.println("Я пингвин.");
        System.out.println("Нас уже " + count + " пингвинов.");

       // size = 20;
    }

    public void fly(){ //Переопределение метода.
        System.out.println("Я не умею летать!");
        //;
    }

    public void hello(Parrot p){
        System.out.println("Привет, попугай " + p.getName() + "!");
    }

    public void hello(Penguin p){
        System.out.println("Привет, пингвин!");
    }

    public void draw(Graphics g){
        super.draw(g);
        g.setColor(Color.WHITE);
        g.fillOval(x - size/4, -y - size/4, size/2, size/2);
    }
}
