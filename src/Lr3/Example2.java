package Lr3;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели");
        String day = in.next();
        switch (day){
            case "понидельник":{
                System.out.println("Дню недели "+ day + " соответствует число 1");
                break;
            }
            case "вторник":{
                System.out.println("Дню недели "+ day + " соответствует число 2");
                break;
            }
            case "среда":{
                System.out.println("Дню недели "+ day + " соответствует число 3");
                break;
            }
            case "четверг":{
                System.out.println("Дню недели "+ day + " соответствует число 4");
                break;
            }
            case "пятница":{
                System.out.println("Дню недели "+ day + " соответствует число 5");
                break;
            }
            case "суббота":{
                System.out.println("Дню недели "+ day + " соответствует число 6");
                break;
            }
            case "воскресенье":{
                System.out.println("Дню недели "+ day + " соответствует число 7");
                break;
            }
            default:{
                System.out.println("Дню недели "+ day + " не существует");
                break;
            }

        }
    }
}
