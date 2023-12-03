package Lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter first number");
        int first = in.nextInt();
        System.out.println("enter second number");
        int sec = in.nextInt();
        int all = first + sec;
        System.out.println("finale number " + all);
    }
}
