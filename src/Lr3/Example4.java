package Lr3;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите наименьшее число");
        int min = in.nextInt();
        System.out.println("Введите наибольшее число");
        int max = in.nextInt();
        for(;min<=max; min++){
            System.out.println(min+" ");
        }
        System.out.println();
    }
}
