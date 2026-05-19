import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        
        int firstNumber = userInput.nextInt();

        System.out.print("Enter second Number: ");
        
        int secondNumber = userInput.nextInt();

        System.out.print("Enter third Number: ");
        
        int thirdNumber = userInput.nextInt();

        int largest = firstNumber;


        if(largest > secondNumber) {
        
           largest = secondNumber;

        }

        if(thirdNumber > largest) {

             largest = thirdNumber;

        }

            System.out.print(largest);        
    
          

    }

}
