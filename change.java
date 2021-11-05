import java.util.*;

public class change {
    public static void main(String[] args) {

        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        Scanner inp = new Scanner(System.in);
        int cents = inp.nextInt();
        while(cents >= 25){
            quarters++;
            cents -= 25;
        }
        while(cents >= 10){
            dimes++;
            cents -= 10;
        }
        while(cents >= 5){
            nickels++;
            cents -= 5;
        }

        System.out.print("Quarters: ");System.out.println(quarters);
        System.out.print("Dimes: ");System.out.println(dimes);
        System.out.print("Nickels: ");System.out.println(nickels);
        System.out.print("Pennies: ");System.out.println(cents);
        inp.close();
    }
}