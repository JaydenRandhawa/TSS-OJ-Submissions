import java.util.*;

public class guessingGame {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        long seed = inp.nextLong();
        int guess = inp.nextInt();
        
        Random rand = new Random(seed);

        int number = rand.nextInt(20)+1;

        if(guess == number){
            System.out.println("WINNER");
        }
        else{
            System.out.println("LOSER");
        }
    }
    
}
