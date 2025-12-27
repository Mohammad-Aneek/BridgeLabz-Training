import java.util.Scanner;

public class ElectionBoothManager {
    private int candidate1Votes = 0;
    private int candidate2Votes = 0;
    private int candidate3Votes = 0;

    private void vote(int voteChoice){ 
        switch (voteChoice) {
            case 1:
                candidate1Votes++;
                break;
            case 2:
                candidate2Votes++;
                break;
            case 3:
                candidate3Votes++;
                break;
            default:
                System.out.println("Invalid vote. Please enter 1, 2, or 3.\n");
                break;
        }
    }

    public void startVoting(){
        Scanner input = new Scanner(System.in);
        int specialCode = -123;

        while(true) {
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            if (age == specialCode) {
                System.out.println("Special Code detected.");
                break;
            } else if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.print("Record your vote (1/2/3 for candidates): ");
            int voteChoice = input.nextInt();
            this.vote(voteChoice);

        }

        input.close();
    }

    void displayResult() {
        System.out.println("Candidate 1 votes: " + candidate1Votes);
        System.out.println("Candidate 2 votes: " + candidate2Votes);
        System.out.println("Candidate 3 votes: " + candidate3Votes);

        // Determine simple winner or tie
        int maxVotes = Math.max(candidate1Votes, Math.max(candidate2Votes, candidate3Votes));
        if (maxVotes == 0) {
            System.out.println("No valid votes recorded.");
        } else {
            boolean tie12 = candidate1Votes == candidate2Votes && candidate1Votes == maxVotes;
            boolean tie23 = candidate2Votes == candidate3Votes && candidate2Votes == maxVotes;
            boolean tie13 = candidate1Votes == candidate3Votes && candidate1Votes == maxVotes;
            if (tie12 || tie23 || tie13) {
                System.out.println("Result: Tie between top candidates.");
            } else if (candidate1Votes == maxVotes) {
                System.out.println("Result: Candidate 1 wins.");
            } else if (candidate2Votes == maxVotes) {
                System.out.println("Result: Candidate 2 wins.");
            } else {
                System.out.println("Result: Candidate 3 wins.");
            }
        }
    }

    public static void main(String[] args){
        ElectionBoothManager object = new ElectionBoothManager();
        object.startVoting();
        object.displayResult();
    }
}
