import java.util.Scanner;

public class pizzaCost {
    public static void main(String[] args) {
        final double lr = 1.75;

        Scanner inp = new Scanner(System.in);
        int d = inp.nextInt();
        System.out.print("$");
        System.out.format("%.2f", 0.05 * d * d + lr);
        
        inp.close();
    }
}
