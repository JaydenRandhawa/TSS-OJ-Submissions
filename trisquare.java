import java.util.Scanner;

public class trisquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int triangleSize = (size+1)/2;

        for(int i = 1;i<= triangleSize; i++){
            int cancel = 0;
            for(int j = i; j<= triangleSize; j++){
                if (cancel!=0){
                    System.out.print(" ");
                }
                else{
                    cancel++;
                }
            }
            for(int k = 1;k<2*i;k++){
                if(i == triangleSize || (k==1 || k==2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        int height = size - 1, width = size;
        for(int i = 1; i<height; i++){
            System.out.print("*");
            for(int j=2;j<width;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0;i<width;i++){
            System.out.print("*");
        }

        scan.close();
    }
}