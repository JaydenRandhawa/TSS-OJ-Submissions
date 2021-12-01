import java.util.Scanner;
import java.text.DecimalFormat;

public class theQuadraticEquation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();

        double discriminate = Math.pow(b, 2)-4*a*c;

        if(discriminate < 0){
            System.out.println("No real roots.");
        }
        else if(discriminate == 0){
            System.out.println("One real root.");
        }
        else if(discriminate > 0){

            double root1 = Double.parseDouble(df.format((-b+Math.sqrt(discriminate))/(2*a)));
            double root2 = Double.parseDouble(df.format((-b-Math.sqrt(discriminate))/(2*a)));

            if((root1*100)%10 == 0){
                root1 = (root1*100)/10;
                if(root1%10 == 0){
                    root1 = root1/10;
                }
                else{
                    root1 = root1/10.0;
                }
            }

            if((root2*100)%10 == 0){
                root2 = (root2*100)/10;
                if(root2%10 == 0){
                    root2 = root2/10;
                }
                else{
                    root2 = root2/10.0;
                }
            }


            System.out.println(root1);
            System.out.println(root2);
        }
    }
    
}