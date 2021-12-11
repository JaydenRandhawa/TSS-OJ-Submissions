import java.util.Scanner;
public class necklaceProblem {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int sequenceCount = inp.nextInt();


        for(int i=0; i<sequenceCount;i++){

            int num1 = inp.nextInt();
            int num2 = inp.nextInt();
            
            int sum;
            int pos1 = num1;
            int pos2 = num2;

            System.out.print(num1 + " " + num2 + " ");

            do {
                sum = pos1+pos2;
                pos1 = pos2%10;
                pos2 = sum%10;
                System.out.print(pos2 + " ");
            }
            while(pos1 != num1 || pos2 != num2);
            System.out.println();

        }
    }
}

// 2 1 3 4 7 1 8 9 7 6 3 9 2 1