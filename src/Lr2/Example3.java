package Lr2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int numb = in.nextInt();

        if(((numb % 4) == 0) & numb < 10){
            System.out.println("Число делится на 4 и оно меньше 10");
        }
        else {
            System.out.println("Число не делится на 4 без остатка или больше 10");
        }
    }
}
