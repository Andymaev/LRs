package timus;
import java.util.Scanner;
public class timus2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сколько прострелянно банок");
        int canL = in.nextInt();
        int canG = in.nextInt();

        int canstotal = canL + canG - 1;
        int lar = canstotal - canL;
        int gar = canstotal - canG;
        System.out.println(lar + " " + gar);
    }
}
