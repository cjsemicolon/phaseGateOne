import java.util.Scanner;
public class TaskThree {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = userInput.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = userInput.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.print(sum);

    }

}
