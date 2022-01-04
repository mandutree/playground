import java.util.Scanner;

public class interestCalc {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double total = 0;
        int[] brackets = {49_020, 98_040, 151_978, 216_511,};

        System.out.print("Enter in the amount of stocks: ");
        double stockAmt = Double.parseDouble(src.nextLine());

        System.out.print("Enter the initial stock price: ");
        double initialPrice = Double.parseDouble(src.nextLine());

        System.out.print("Enter the current stock price: ");
        double finalPrice = Double.parseDouble(src.nextLine());

        double profit = (stockAmt * finalPrice) - (stockAmt * initialPrice);

        if(profit <= brackets[0]) {
            total = profit * 0.85;
            System.out.println("profit: " + total);
        }
        else if(profit <= brackets[1]) {
            total = ((profit - brackets[0]) * 0.795) + 41_667;
            System.out.println("profit: " + total);
        }
        else if(profit <= brackets[2]) {
            total = ((profit - brackets[1]) * 0.74) + 80_637.9;
            System.out.println("profit: " + total);
        }
        else if(profit <= brackets[3]) {
            total = ((profit - brackets[2]) * 0.71) + 118_933.88;
            System.out.println("profit: " + total);
        }
        else {
            total = ((profit - brackets[3]) * 0.67) + 162_170.99;
            System.out.println("profit: " + total);
        }
    }
}
