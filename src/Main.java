import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Random rnd = new Random();
        boolean doneWithGame = false;
        boolean doneWithProgram = false;
        int dyeOne = 0;
        int dyeTwo = 0;
        int total = 0;
        int point = 0;
        while (!doneWithProgram) {
            doneWithGame = false;
            dyeOne = rnd.nextInt(6) + 1;
            dyeTwo = rnd.nextInt(6) + 1;
            total = dyeOne + dyeTwo;}
            if ((total == 7) || (total == 11)) {
                System.out.println("You rolled " + dyeOne + " and a " + dyeTwo + ", making a total of " + total + ", which means you win with a natural!");
                doneWithGame = true;
            } else if ((total == 2) || (total == 3) || (total == 12)) {
                System.out.println("You rolled a " + dyeOne + " and a " + dyeTwo + ", making a total of " + total + ", which means you crapped out ):");
                doneWithGame = true;
            } else {
                System.out.println("You rolled a " + dyeOne + " and a " + dyeTwo + ", making a total of " + total + ", which is the new point!");
                point = total;
            }
            while (!doneWithGame) {
                dyeOne = rnd.nextInt(6) + 1;
                dyeTwo = rnd.nextInt(6) + 1;
                total = dyeOne + dyeTwo;
                if (total == 7) {
                    System.out.println("You rolled a " + dyeOne + " and a " + dyeTwo + ", making a total of " + total + ", which means you lose ):");
                    doneWithGame = true;
                } else if (total == point) {
                    System.out.println("You rolled a " + dyeOne + " and a " + dyeTwo + ", making a total of " + total + ", which makes the point. You win!");
                    doneWithGame = true;
                } else {
                    System.out.println("You rolled a " + dyeOne + " and a " + dyeTwo + ", making a total of " + total + ", which is not 7 or " + point + ", Roll again!");
                }
            }
            if (!SafeInput.getYNConfirm(in, "Play again? ")) {
                doneWithProgram = true;
            }
        }
    }