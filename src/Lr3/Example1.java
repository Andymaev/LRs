package Lr3;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число в диапозоне от 1 до 7");
        int numb = in.nextInt();
        switch (numb){
            case 1:{
                System.out.println("Число " + numb + " соответсвует понидельнику");
                break;
            }
            case 2:{
                System.out.println("Число " + numb + " соответсвует вторнику");
                break;
            }
            case 3:{
                System.out.println("Число " + numb + " соответсвует среде");
                break;
            }
            case 4:{
                System.out.println("Число " + numb + " соответсвует четвергу");
                break;
            }
            case 5:{
                System.out.println("Число " + numb + " соответсвует пятнице");
                break;
            }
            case 6:{
                System.out.println("Число " + numb + " соответсвует субботе");
                break;
            }
            case 7:{
                System.out.println("Число " + numb + " соответсвует воскресению");
                break;
            }
            default:{
                System.out.println("Введено некорректное значение");
                break;
            }
        }
    }
}
