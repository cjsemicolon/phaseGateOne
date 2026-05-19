import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        
        int firstNumber = userInput.nextInt();

        System.out.print("Enter second Number: ");
        
        int secondNumber = userInput.nextInt();

        if(firstNumber > secondNumber) {
        
            System.out.print(firstNumber);

        }else{

            System.out.print(secondNumber);        
    
        }  

    }

}
