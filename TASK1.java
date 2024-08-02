import java.util.Random;
import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int trys = 5;
        int score = 0;
        String tryAgain;

        do {
            int n = rand.nextInt(101);
            System.out.println("Guess a number between 1 and 100:");
            int attempt = 0;
            boolean correctGuess = false;

            while (attempt < trys) {
                int myguess = sc.nextInt();
                attempt++;

                if (myguess == n) {
                    System.out.println("Your guess number " + myguess + " is correct.\nCongradulations!!");
                    correctGuess = true;
                    score = score + (trys - attempt + 1); 
                    break;
                }

                if (myguess < n){
                    System.out.println("Your guess number " + myguess + " is lower.\nTry again:");
                }

                else {
                    System.out.println("Your guess number " + myguess + " is higher.\nTry again:");
                }
            }

            if (!correctGuess) {
                System.out.println("You've used all attempts. The correct number was " + n);
            }

            System.out.println("Current score: " +score);
            System.out.println("Do you want to go again? (Yes/No)");
            tryAgain = sc.next();
        } while (tryAgain.equalsIgnoreCase("Yes"));

        System.out.println("Thank you!!\nFinal score: " + score);
        sc.close();
    }
}
