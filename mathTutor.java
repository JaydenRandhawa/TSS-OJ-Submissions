import java.util.*;

public class mathTutor {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        long seed = inp.nextLong();
        String symbol = inp.next();
        
        Random rand = new Random(seed);

        int int1 = rand.nextInt(100);
        int int2 = rand.nextInt(100);

        switch (symbol) {
            case "+":
                System.out.printf("%s%s%s%s", int1, "+", int2, "=");
                System.out.println(int1+int2);
                break;
            case "-":
                System.out.printf("%s%s%s%s", int1, "-", int2, "=");
                System.out.println(int1-int2);
                break;
            case "*":
                System.out.printf("%s%s%s%s", int1, "*", int2, "=");
                System.out.println(int1*int2);
                break;
            case "/":
                System.out.printf("%s%s%s%s", int1, "/", int2, "=");
                System.out.println(int1/int2);
                break;

        }
    }
    
}