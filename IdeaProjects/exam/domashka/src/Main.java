import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Bird b1 = new Bird();
        //b1.fly();
        //b1.fly();

        Parrot p1 = new Parrot();
        p1.fly();

        //System.out.println(p1 instanceof Parrot);
        //System.out.println(p1 instanceof Bird);
        //System.out.println(p1 instanceof Object);

        p1.speak();
        //p1.name = "Клёпа";
        //p1.rename("Клёпа");
        p1.setName("Клёпа");
        p1.speak();

        //System.out.println(p1.name);
        System.out.println(p1.getName());

        Parrot p2 = new Parrot("Qqqq");
        p2.speak();

        //p2 = p1;
        //p2.speak();

        //Bird.printCount();

        Penguin p3 = new Penguin();
        p3.fly();

        Bird[] birds = new Bird[]{p1, p2, p3};
        //for(int i = 0; i < birds.length; i++){
        //    birds[i].fly();
        //}
        for(Bird b: birds){
            b.fly();
            if(b instanceof Parrot)
                ((Parrot)b).speak();
        }

        p1.hello(p2);
        p1.hello(p3);
        p3.hello(p3);
        p3.hello(p1);

        //Bird.printCount();
        //p3.printCount();

        /*ArrayList<Bird> team = new ArrayList<Bird>();
        team.add(p1);
        team.add(p1);
        team.add(p2);
        team.add(p3);
        System.out.println(team.size());
        System.out.println(team.indexOf(p3));*/

        Group g1 = new Group();
        g1.add(p1);
        g1.add(p2);
        g1.add(p3);
        g1.add(p3);
        g1.printSize();

        Group g2 = g1.union(g1);

        Scene scene = new Scene(g1);
    }
}