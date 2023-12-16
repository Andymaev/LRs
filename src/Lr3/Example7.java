package Lr3;
public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] arr = new char[size];
        char firstchar = 'a';
        for(int i = 0; i<arr.length; i++){
            arr[i] = firstchar;
            firstchar+=2;
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]+" ");
        }
    }
}
