import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ КОЛИЧЕСТВО СТРОК");
        int p = in.nextInt();
        System.out.println("ВВЕДИТЕ КОЛИЧЕСТВО СТОЛБЦОВ");
        int l = in.nextInt();
        Life life = new Life(p, l);//создал экземпляр класса потому что у тебя массив заполнялся в конструкторе, а пока не создан экземпля конструктор не сработает(из - за этого была ошибка)
        Grid grid1 = new Grid(p * 20, l * 20);
        Cell[][] cells = new Cell[p][l];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j] = new Cell(false);
            }
        }
        cells[0][1].alive();
        cells[1][2].alive();
        cells[2][2].alive();
        cells[2][1].alive();
        cells[2][0].alive();
    }
}