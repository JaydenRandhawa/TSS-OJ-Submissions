import java.util.*;

public class stringRemover {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String sentence = inp.nextLine();
        String str = inp.nextLine();

        while(sentence.contains(" " + str + " ")){
            sentence = sentence.replace(" " + str + " ", " ");
        }

        if(sentence.endsWith(" " + str)){
            sentence = sentence.substring(0, sentence.length() - (str.length()+1));
        }
        if(sentence.startsWith(str + " ")){
            sentence = sentence.substring(str.length() + 1, sentence.length());
        }

        if(sentence.equals(str)){
            sentence = "";
        }

        System.out.println(sentence);
    }
}