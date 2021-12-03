import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String pass = inp.nextLine();

        for(int i=0;i<3;i++){
            String guess = inp.nextLine();

            if(guess.equals(pass)){
                System.out.println("Access granted.");
                break;
            }
            else{
                System.out.println("Incorrect.");
                if(i == 2){
                    System.out.println("Access denied.");
                }
            }
        }
    }
    
}