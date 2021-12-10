import java.util.*;

public class ukPostalCodes{
    public static void main(String[] args) {
        List formats = new ArrayList();
        formats.add("A9 9AA");
        formats.add("A9A 9AA");
        formats.add("A99 9AA");
        formats.add("AA9 9AA");
        formats.add("AA9A 9AA");
        formats.add("AA99 9AA");

        Scanner inp = new Scanner(System.in);
        String code = inp.nextLine().toUpperCase();
        double code2 = 0;
        String template = "";

        for(int i=0;i<code.length();i++){

            if(code.charAt(i) >= 48 && code.charAt(i) <= 57){
                template += "9";
            }
            else if(code.charAt(i) >= 65 && code.charAt(i) <= 90){
                template += "A";
            }
            else{
                template += " ";
            }
        }
        if(formats.contains(template)){
            System.out.println("code");
        }
        else{
            System.out.println("not code");
        }
    }
    
}