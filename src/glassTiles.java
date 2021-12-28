import java.util.Scanner;

public class glassTiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String correctTile = "";
        String wrongTile = "";
        String guess = "";
        int correctGuess = 0;

        while (true){
            if (guess.equals(wrongTile)){
                break;
            }
                int random = (int)(Math.random() * 2); // Math.random() gives a random value between 0 - 0.99 etc.
                System.out.println("Choose left or right: ");
                guess = sc.nextLine();

                if (random == 0){
                    correctTile = "left";
                    wrongTile = "right";
                }
                else {
                    correctTile = "right";
                    wrongTile = "left";
                }

                if (!guess.equalsIgnoreCase("left") && !guess.equalsIgnoreCase("right")) {
                    System.out.println("That's not a choice. Choose left or right, or die!");
                }
                else {
                    if (guess.equalsIgnoreCase(correctTile)){
                        System.out.println("you survived, continue");
                        correctGuess++;
                    }
                    else {
                        System.out.println("you fell to your death");
                    }
                }
            }
    }
}
