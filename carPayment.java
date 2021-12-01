import java.util.Scanner;

public class carPayment {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double p = inp.nextDouble();
        double r = inp.nextDouble();
        int m = inp.nextInt();
    
        double t = (p*(r/12))/(1-Math.pow((1+(r/12)), -m));

        System.out.printf("%.2f", t);
        
    }
}