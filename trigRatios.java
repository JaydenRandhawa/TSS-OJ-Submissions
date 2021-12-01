import java.util.Scanner;
import java.text.DecimalFormat;

public class trigRatios {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double angle = Math.toRadians(inp.nextDouble());

        double sin = Double.parseDouble(df.format(Math.sin(angle)));
        double cos = Double.parseDouble(df.format(Math.cos(angle)));
        double tan = Double.parseDouble(df.format(Math.tan(angle)));

        if((sin*100)%10 == 0){
            sin = (sin*100)/10;
            if(sin%10 == 0){
                sin = sin/10;
            }
            else{
                sin = sin/10.0;
            }
        }

        if((cos*100)%10 == 0){
            cos = (cos*100)/10;
            if(cos%10 == 0){
                cos = cos/10;
            }
            else{
                cos = cos/10.0;
            }
        }

        if((tan*100)%10 == 0){
            tan = (tan*100)/10;
            if(tan%10 == 0){
                tan = tan/10;
            }
            else{
                tan = tan/10.0;
            }
        }

        System.out.println(sin);
        if(cos == 1.0){
            System.out.println(1);
        }
        else{
            System.out.println(cos);
        }
        System.out.println(tan);
    }
    
}