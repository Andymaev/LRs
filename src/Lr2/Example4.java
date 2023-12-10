package Lr2;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int numb = in.nextInt();
        if(5<= numb & numb <=10){
            System.out.println("Число больше или равно 5 и меньше или равно 10");
        }
        else{
            System.out.println("Число меньше 5 или больше 10");
        }
    }
}
