import java.util.Scanner;

public class exponentCalculation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double x = inp.nextDouble();
        double y = inp.nextDouble();

        System.out.println(Math.exp(y*Math.log(x)));
        System.out.println(Math.pow(x, y));
    }
    
}