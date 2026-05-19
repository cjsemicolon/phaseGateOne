import java.util.Scanner;
public class TaskTen {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = userInput.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = userInput.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = userInput.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;

        double average = sum/3;

        System.out.print(average);

    }

}
