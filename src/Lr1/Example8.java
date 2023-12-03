package Lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter today day");
        int day = in.nextInt();

        System.out.println("Enter today month");
        int month = in.nextInt();

        System.out.println("Enter today year");
        int year = in.nextInt();

        System.out.println("Today date is: " + day +" " + month + " " + year);

    }
}
