import java.awt.*;

public class Parrot extends Bird{
    private static int count = 0;

    private String name = "Кеша"; //переменная экземпляра класса

    public Parrot(){
        count++;
        System.out.println("Я попугай.");
        System.out.println("Нас уже " + count + " попугаев.");

        color = new Color(0, 255, 0);
    }

    public Parrot(String name){ //Перегрузка метода.
        this.name = name;
        count++;
        System.out.println("Я попугай.");
        System.out.println("Нас уже " + count + " попугаев.");

        color = new Color(0, 255, 0);
    }

    public void speak(){
        System.out.println("Меня зовут " + name + ".");
    }

    //public void rename(String name){
    //    this.name = name;
    //}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void hello(Parrot p){
        System.out.println("Привет, попугай " + p.name + "! " + "Меня зовут " + name + ".");
    }

    public void hello(Penguin p){
        System.out.println("Привет, пингвин! " + "Меня зовут " + name + ".");
    }
}