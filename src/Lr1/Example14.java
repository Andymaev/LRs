package Lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number :");
        int number = in.nextInt();
        int number1 = number - 1;
        int number2 = number + 1;
        int number35 = number + number1 + number2;
        int number3 = number35 * number35;
        System.out.println(number1 + " " + number + " " + number2 +" " + number3);
    }
}
