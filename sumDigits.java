import java.util.*;

public class sumDigits {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      String num = inp.nextLine();

      inp.close();

      int sum = 0;

      for(int i=0;i<num.length();i++){
        sum += Character.getNumericValue(num.charAt(i));
      }

      System.out.println(sum);
    }
}