package Lr3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел фибоначи");
        int num = in.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0+" "+n1+" ");
        for(int i = 3; i<=num; i++){
            n2 = n0+n1;
            System.out.println(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}
