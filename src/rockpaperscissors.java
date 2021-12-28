import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String opponentMove = "";
        String myMove = "";
        int losses = 0;
        int wins = 0;
        while (true) {
            int random = (int)(Math.random() * 3);
            System.out.println("Enter, rock, paper or scissors: ");
            myMove = sc.nextLine();

            if (myMove.equalsIgnoreCase("quit")){
                System.out.println("Wins: " + wins);
                System.out.println("Losses: " + losses);
                break;
            }

            if (!myMove.equalsIgnoreCase("rock") && !myMove.equalsIgnoreCase("scissors") && !myMove.equalsIgnoreCase("paper")){
                System.out.println("your move isn't valid");
            }
            else {
                if (random == 0){
                    opponentMove = "rock";
                }
                else if (random == 1){
                    opponentMove = "scissors";
                }
                else {
                    opponentMove = "paper";
                }
                System.out.println("Opponent: " + opponentMove);

                if (myMove.equals(opponentMove)){
                    System.out.println("tie");
                }
                else if (myMove.equalsIgnoreCase("rock") && opponentMove.equals("scissors") ||
                        myMove.equalsIgnoreCase("scissors") && opponentMove.equals("paper") ||
                        myMove.equalsIgnoreCase("paper") && opponentMove.equals("rock")){
                    System.out.println("you win");
                    wins++;
                }
                else {
                    System.out.println("you lost");
                    losses++;
                }
            }
        }
    }
}