import java.util.Scanner;

public class ObjectHeight {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double time = inp.nextDouble();
        System.out.printf("%.1f", 100-4.9*Math.pow(time, 2));

        inp.close();
    }
}
