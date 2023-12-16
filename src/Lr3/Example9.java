package Lr3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер массива равен "+size);
        int[] num = new int[size];
        Random random = new Random();
        for(int i = 0; i <num.length; i++){
            num[i] = random.nextInt(200);
            System.out.println("Элемент массива["+i+"] = "+num[i]);
        }
        int min = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i]<num[0]){
                min = num[i];
            }
        }
        int count = 0;
        for(int i = 0; i< num.length; i++){
            if(num[i] == min){
                count++;
            }
        }
        int[] index = new int[count];
        int iter = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i] == min){
                index[iter] = i;
                iter++;
            }
        }
        System.out.println("Минимальное число в массие = "+min+" Его индекс/ы : "+ Arrays.toString(index));
        Arrays.sort(num);
        System.out.println("Произведина сортировка массива");
        for(int i = 0; i < num.length; i++){
            System.out.println("Элемент массива ["+i+"] после сортировки = "+num[i]);

        }
    }
}
