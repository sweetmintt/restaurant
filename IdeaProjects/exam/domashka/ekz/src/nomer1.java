import java.util.Scanner;
public class nomer1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int kol = 0;
        try{
            while(true) {
                int x = in.nextInt();
                if (x < min){
                    min = x;
                    kol = 0;
                }
                if (x == min){
                    kol++;
                }
                System.out.println(kol);
            }
        } catch (Exception e) {
        }
    }
}
