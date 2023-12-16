package timus2100;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus2100/input.txt";
        boolean oj = System.getProperties("ONLINE_JUDGE") != null;
        int marshallAndLilly = 2;

        try{
            BufferedReader br =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numberOfFriends = 0;
            int numberOfPairs = 0;
            while ((readLine = br.readLine()) != null){
                if(numberOfFriends ==0){
                    numberOfPairs = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+")){
                    numberOfPairs++;
                }
            }
            int result;
            int guest = (marshallAndLilly + numberOfFriends + numberOfPairs);
            if(guest == 13){
                result = (guest*100)+ 100;
            }
            else {
                result = guest*100;
            }
            System.out.println(result);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
