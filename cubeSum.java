import java.util.Scanner;

public class cubeSum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner inp = new Scanner(System.in);
        String num = inp.nextLine();
        inp.close();

        for(int i=0;i<num.length();i++){
            sum += Math.pow(Character.getNumericValue(num.charAt(i)), 3);
        }

        System.out.println(sum);

    }
}
