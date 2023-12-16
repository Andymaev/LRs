package timus;
import java.util.Scanner;
public class timus3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pc;
        int wires;
        int hours = 0;
        int pair = 1;
        int readypc = 1;

        pc = in.nextInt();
        wires = in.nextInt();

        while (pair <= wires & readypc < pc & readypc < wires){
            readypc += pair;
            hours++;
            pair = readypc;
        }
        hours += Math.ceil((double) (pc - readypc)/ wires);
        System.out.println(hours);
    }
}
