import java.util.Scanner;

public class monogram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String fn = inp.next();
        String mn = inp.next();
        String ln = inp.next();

        if(Character.isUpperCase(fn.charAt(0))) System.out.print(Character.toLowerCase(fn.charAt(0)));
        else System.out.print(Character.toUpperCase(fn.charAt(0)));

        if(Character.isUpperCase(mn.charAt(0))) System.out.print(Character.toLowerCase(mn.charAt(0)));
        else System.out.print(Character.toUpperCase(mn.charAt(0)));

        if(Character.isUpperCase(ln.charAt(0))) System.out.print(Character.toLowerCase(ln.charAt(0)));
        else System.out.print(Character.toUpperCase(ln.charAt(0)));
    }
    
}
