import java.util.Arrays;
import java.util.Scanner; 

class vowelCounter {
    public static void main(String[] args) {
        int vowelCount = 0;
        Scanner inp = new Scanner(System.in);
        String sentence = inp.nextLine().toLowerCase();
        inp.close();

        for(int i=0;i<sentence.length();i++){
            char letter = sentence.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowelCount ++;
            }
        }

        System.out.println(vowelCount);
    }
  }