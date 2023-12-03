package Lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц");
        String moth = in.nextLine();

        System.out.println("Введите количество дней в месяце");
        int days = in.nextInt();

        switch (moth){

            case "январь":
                if(days == 31){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
            break;
            case "февраль":
                if(days == 28){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "март":
                if(days == 31){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "апрель":
                if(days == 30){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "май":
                if(days == 31){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "июнь":
                if(days == 30){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "июль":
                if(days == 31){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "август":
                if(days == 30){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "сентябрь":
                if(days == 31){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "октябрь":
                if(days == 31){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "ноябрь":
                if(days == 30){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;
            case "декабрь":
                if(days == 31){
                    System.out.println("В " + moth + days + " день");
                }
                else{
                    System.out.println("В " + moth + " не "+ days);
                }
                break;

        }
    }
}
