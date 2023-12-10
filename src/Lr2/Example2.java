package Lr2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int numb = in.nextInt();

        if(((numb % 5)== 2) & ((numb % 7) == 1)){
            System.out.println("Число делится на 5 с остатком 2 и делится на 7 с остатком 1");
        }
        else{
            System.out.println("Число не подходит условиям");
        }
    }
}
