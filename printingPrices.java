import java.util.Scanner;

public class printingPrices {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int copies = inp.nextInt();

        if(copies<100){
            System.out.println("0.30");
            System.out.format("%.2f", 0.3*copies);
        }
        else if(copies<500){
            System.out.println("0.28");
            System.out.format("%.2f", 0.28*copies);
        }
        else if(copies<750){
            System.out.println("0.27");
            System.out.format("%.2f", 0.27*copies);
        }
        else if(copies<1001){
            System.out.println("0.26");
            System.out.format("%.2f", 0.26*copies);
        }
        else if(copies>1000){
            System.out.println("0.25");
            System.out.format("%.2f", 0.25*copies);
        }
    }
    
}