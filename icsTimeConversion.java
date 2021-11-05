import java.util.*;

public class icsTimeConversion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int minutes = inp.nextInt();
        int hours = 0;

        while(minutes>=60){
            hours += 1;
            minutes -= 60;
        }

        System.out.print(hours);
        System.out.print(":");

        if(minutes<10){
            System.out.print(0);
            System.out.print(minutes);
        }
        else{
            System.out.print(minutes);
        }

    }
}