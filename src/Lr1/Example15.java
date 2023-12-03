package Lr1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = in.nextInt();
        System.out.println("Enter second number");
        int sec = in.nextInt();
        int allp = first + sec;
        int allm = first - sec;
        System.out.println("Summation of numbers: " + allp);
        System.out.println("Subtraction of numbers: " + allm);
    }
}
