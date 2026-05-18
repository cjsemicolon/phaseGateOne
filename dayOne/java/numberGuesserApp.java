import java.util.Scanner;
import java.util.Random;

public class NumberGuesserApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randomNumber = new Random();

        int count = 0;
        
        while (true) {
            int number = randomNumber.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;

            while (attempts < 5) {

                System.out.print("Guess the number: ");

                int guess = userInput.nextInt();

                if (guess < 1 || guess > 100) {

                    System.out.print("Invalid number ");                    

                }else{

                     attempts++;


                }

                if (guess == number) {

                    System.out.println("Correct");

                    count++;

                    correctGuess = true;

                    break;

                } else if (guess < number) {

                    System.out.println("Too low");

                } else {

                    System.out.println("Too high");
                }
            }

            if (!correctGuess) {

                System.out.println("Failed. The number was " + number );
            }

            System.out.println("Score: " + count);

            //userInput.nextLine();
            
            System.out.print("Care to go another round??? (yes/no): ");

            String response = userInput.nextLine().trim().toLowerCase();

            if (!response.equals("yes")) {

                System.out.println("Thanks for playing! Final score: " + count);

                if(attempts == 1) {
        
                    System.out.print("Legendary!!!");

                }else if(attempts == 2) {

                    System.out.print("Excellent");
            
                }else if(attempts > 2 && attempts < 5) {

                    System.out.print("Good");
            
               }else if(attempts == 5) {

                    System.out.print("Close");

               }else{

                    System.out.print("Better luck");
               
               }

                break;
            }
        }
        
    }
}
