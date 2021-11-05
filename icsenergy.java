import java.util.Scanner;
import java.text.DecimalFormat;

public class icsenergy {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###");
        final long csqr = 90000000000000000L;
        Scanner inp = new Scanner(System.in);
        double mass = inp.nextDouble();
        System.out.println(df.format(mass*csqr));
        System.out.println(df.format(mass*csqr/360000));

        inp.close();
    }
}