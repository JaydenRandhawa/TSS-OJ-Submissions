import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long seed = inp.nextLong();
        Random rand = new Random(seed);

        System.out.println(getResult(rand.nextInt(13)+1, inp.next()));
    }

    public static int getResult(int num, String range){
        if(num < 7 && range.equals("Lo") || num > 7 && range.equals("Hi")) return(1);
        else if(num == 7) return(0);
        else return(-1);
    }
}