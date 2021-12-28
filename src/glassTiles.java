import java.util.Scanner;

public class glassTiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int correctCounter = 0;

        while (true) {
            boolean correctTile = random.nextBoolean();
            System.out.println("Choose left or right: ");
            String guess = sc.nextLine();

            if (!guess.equalsIgnoreCase("left") && !guess.equalsIgnoreCase("right")) {
                System.out.println("That's not a choice. Choose left or right, or die!");
                continue;
            }

            if (guess.equalsIgnoreCase("left") == correctTile) {
                if (++correctCounter > 4) {
                    System.out.println("You survived the game!!!");
                    break;
                }
                System.out.println("you survived the round, continue");
            } else {
                System.out.println("you fell to your death");
                break;
            }
        }
    }
}
