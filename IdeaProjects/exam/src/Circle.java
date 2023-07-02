import java.awt.*;
import java.util.Scanner;
public class Circle extends Bird {
    Scanner scan = new Scanner(System.in);
    public int x1 = scan.nextInt(), y1 = scan.nextInt(), r1 = scan.nextInt();
    public int x = x1 - (r1 / 2);
    public int y = y1 - (r1 / 2);

}