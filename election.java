import java.util.*;

public class election {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double votes1 = inp.nextInt();
        double votes2 = inp.nextInt();
        double votes3 = inp.nextInt();
        double totalVotes = (int)votes1+(int)votes2+(int)votes3;
        double percent1 = votes1/totalVotes*100;
        double percent2 = votes2/totalVotes*100;
        double percent3 = votes3/totalVotes*100;
        inp.nextLine();
        String name1 = inp.nextLine();
        String name2 = inp.nextLine();
        String name3 = inp.nextLine(); 

        System.out.format("%-15s%10s%15s", "Candidate", "Votes", "Percentage\n");
        System.out.format("%-15s%10s%15s", name1, (int)votes1, String.format("%.2f", percent1)+" %\n");
        System.out.format("%-15s%10s%15s", name2, (int)votes2, String.format("%.2f", percent2)+" %\n");
        System.out.format("%-15s%10s%15s", name3, (int)votes3, String.format("%.2f", percent3)+" %\n");
        System.out.println();
        System.out.format("%-15s%10s", "TOTAL VOTES:", (int)totalVotes);
    }
}