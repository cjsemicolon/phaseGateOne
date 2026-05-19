import java.util.Scanner;
public class TaskFour {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = userInput.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = userInput.nextInt();

        int product = firstNumber * secondNumber;

        System.out.print(product);

    }

}
