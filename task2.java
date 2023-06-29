import java.util.Scanner;

public class task2 {
    public static void numGuessingGame(int numRounds) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[numRounds];

        for (int round = 1; round <= numRounds; round++) {
            System.out.println("Round " + round + ":");
            System.out.println("A number is chosen between 1 to 100.");
            System.out.println("Guess the number within 8 trials.");

            int number = 1 + (int) (100 * Math.random());
            int trials = 8;
            int i, guess;

            for (i = 0; i < trials; i++) {
                System.out.println("Guess the number:");
                guess = sc.nextInt();

                if (number == guess) {
                    int score = trials - i;
                    scores[round - 1] = score;
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Your score for this round: " + score + " out of 10");
                    break;
                } else if (number > guess && i != trials - 1) {
                    System.out.println(guess + " is too low! Try again.");
                } else if (number < guess && i != trials - 1) {
                    System.out.println(guess + " is too high! Try again.");
                }
            }

            if (i == trials) {
                System.out.println("You have exhausted " + trials + " trials.");
                System.out.println("The number was " + number);
                System.out.println("Your score for this round: 0 out of 10");
            }

            System.out.println();
        }

        System.out.println("Game Over!");

        System.out.println("Scores for each round:");
        for (int round = 1; round <= numRounds; round++) {
            System.out.println("Round " + round + ": " + scores[round - 1] + " out of 10");
        }


        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        System.out.println("Total Score: " + totalScore + " out of " + (10 * numRounds));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rounds:");
        int numRounds = sc.nextInt();

        numGuessingGame(numRounds);
    }
}
