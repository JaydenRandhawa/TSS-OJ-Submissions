import java.util.Scanner;

public class packageDelivery {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mass = inp.nextInt();

        int l = inp.nextInt();
        int w = inp.nextInt();
        int h = inp.nextInt();

        int volume = l*w*h;

        if(mass > 27){
            if(volume > 100000){
                System.out.println("Too heavy and too large.");
            }
            else{
                System.out.println("Too heavy.");
            }
        }
        else if(volume > 100000){
            System.out.println("Too large.");
        }
        else{
            System.out.println("Pass.");
        }
    }
}
