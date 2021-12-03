import java.util.Scanner;

public class ukPostalCodes{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String code = inp.nextLine();
        double code2 = 0;
        String template = "";

        for(int i=0;i<code.length();i++){

            try{
                code2 += (int)(code.charAt(i));
                template += "9";
            }
            catch(Exception e){
                template += "A";
            }

            
        }
        System.out.println(template);
    }

}