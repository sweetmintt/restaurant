import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bird.polina2(200,200,100);
        Parrot p1 = new Parrot();
        Bird p2 = new Bird();
        Penguin p3 = new Penguin();
        Penguin p4 = new Penguin();
        Bird p5 = new Bird();
        Group g1 = new Group();
        g1.add(p1);
        g1.add(p2);
        g1.add(p3);
        g1.add(p4);
        g1.add(p5);
        Scene scene = new Scene(g1);
        System.out.println(Bird.cnt);
    }
}