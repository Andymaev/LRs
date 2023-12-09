package timus;

import java.util.Scanner;

public class timus1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cout = in.nextInt();
        int l = in.nextInt();
        int t = in.nextInt();

        int fin = (cout * (l*t)) * 2;
        System.out.println(fin);
    }
}
