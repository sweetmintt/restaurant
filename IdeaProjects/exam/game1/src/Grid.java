import java.awt.*;
import javax.swing.*;
public class Grid extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public static int m;
    public static int n;
    public void setM(int m){
        this.m = m;
    }
    public void setN(int n){
        this.n = n;
    }
    public int getM() {return m;}
    public int getN() {return n;}
    public Grid(int m, int n) {
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.m = m;
        this.n = n;
    }

    @Override
    public void paint(Graphics g) {
        g.translate(0,40);// смещение точки отчета в 0,40 для полного отображения сетки
        for (int x = 20; x < m; x += 20)
            for (int y = 20; y < n; y += 20)
                g.drawRect(x, y, 20, 20);
        Life.statussell();
        //int[][] grid = Life.getGrid();//ошибка вылазила из-за того что ты присваиваешь int[][] массив из Life а он там пустой(см. в классе Life подсказки), я исправил создав экземпляр Life в main
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Life.getGrid()[i][j] == 1) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.RED);
                }
                g.fillRect(i*20, j*20, 20, 20);
            }
        }
    }
}