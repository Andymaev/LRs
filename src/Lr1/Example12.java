package Lr1;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = in.nextInt();
        int nowayear = 2023;
        int year = nowayear - age;
        System.out.println("Your year of birth is : " + year);

    }
}
