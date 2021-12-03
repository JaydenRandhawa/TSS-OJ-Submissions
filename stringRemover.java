import java.util.Scanner;

public class stringRemover {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String sentence = inp.nextLine();
        String str = inp.nextLine();

        sentence = sentence.replace(" " + str + " ", " ");

        if (sentence.endsWith(" " + str)){
            sentence = sentence.replace(" " + str, "");
        }

        System.out.println(sentence);
    }
}