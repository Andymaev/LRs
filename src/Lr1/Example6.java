package Lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your second name");
        String secondname = in.nextLine();

        System.out.println("enter your first name");
        String name = in.nextLine();

        System.out.println("enter your third name");
        String thirdname = in.nextLine();

        System.out.println("Hello " + secondname + " " + name + " " + thirdname);
    }
}
