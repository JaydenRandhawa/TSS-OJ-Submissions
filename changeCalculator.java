import java.util.*;

public class changeCalculator {
  public static void main(String[] args) {
    Scanner coins = new Scanner(System.in);

    int quarters = Integer.parseInt(coins.nextLine());
    int dimes = Integer.parseInt(coins.nextLine());
    int nickels = Integer.parseInt(coins.nextLine());
    int pennies = Integer.parseInt(coins.nextLine());

    coins.close();

    System.out.println(getCents(quarters, dimes, nickels, pennies));
  }

  public static int getCents(int quarters, int dimes, int nickels, int pennies){
    return(quarters*25+dimes*10+nickels*5+pennies);
  }
  
}