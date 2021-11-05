import java.util.*;

public class MarsElection {
    public static void main(String[] args) {

        List<Integer> votes = new ArrayList<Integer>();
        List<Integer> seats = new ArrayList<Integer>();

        List<Float> fractionalSeats = new ArrayList<Float>();
        List<Float> fractionalSeatsOrg = new ArrayList<Float>();

        int totalVotes = 0;
        int seatsRemain = 0;

        Scanner inp = new Scanner(System.in);
        int seatCount = inp.nextInt();
        int partyCount = inp.nextInt();

        for(int i=0;i<partyCount;i++){
            int partyVotes = inp.nextInt();
            votes.add(partyVotes);
            totalVotes += partyVotes;
        }
        
        for(int i=0;i<partyCount;i++){
            float percentage = (int)votes.get(i)/(float)totalVotes;
            float seatsWon = percentage*seatCount;
            seats.add((int)(Math.floor(seatsWon)));
            seatsRemain += (int)(Math.floor(seatsWon));

            fractionalSeats.add(seatsWon-(float)Math.floor(seatsWon));
        }

        for(int i=0;i<partyCount;i++){
            fractionalSeatsOrg.add(fractionalSeats.get(i));
        }
        Collections.sort(fractionalSeatsOrg);
        Collections.reverse(fractionalSeatsOrg);

        seatsRemain = seatCount - seatsRemain;

        int x = 0;

        while(seatsRemain > 0){
            if(x>seatCount-1){
                x = 0;
            }
            seats.set(fractionalSeats.indexOf(fractionalSeatsOrg.get(x)), seats.get(fractionalSeats.indexOf(fractionalSeatsOrg.get(x)))+1);

            x += 1;
            seatsRemain -= 1;
            
        }

        for(int i=0;i<partyCount;i++){
            System.out.println(seats.get(i));
        }
        // System.out.println(fractionalSeats);
        // System.out.println(fractionalSeatsOrg);
        // System.out.println(fractionalSeats.indexOf(fractionalSeatsOrg.get(x)));
        // System.out.println(seatsRemain);
        inp.close();
    }
    
}