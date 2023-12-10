package Lr2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int numb = in.nextInt();
        int fin = numb /1000%10;
        System.out.println("В введенном числе " + fin + " тысяч");
    }
}