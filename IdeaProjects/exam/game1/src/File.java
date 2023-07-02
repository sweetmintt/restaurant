import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class File extends Main{
    public static void main(String[] args) throws IOException{
        //Life lala = new Life();
        int m = 0;
        int n = 0;
        FileReader fr = new FileReader("\"C:\\Users\\tvoro\\OneDrive\\Рабочий стол\\polinka.txt\"");
        Scanner s = new Scanner(fr);
        while (s.hasNextLine()) {
            ++n;
        }
        while (s.hasNextInt()) {
            ++m;
        }
        String str = s.nextLine();
        String[] pol = str.split(" ");
        int pol1 = Integer.parseInt(String.valueOf(pol));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pol1 == 1) {

                } else {
                 //   a[i][j] = 0;
                }
            }
        }
    }
}
