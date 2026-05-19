import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int digit = userInput.nextInt();
            
        int factorial = 1;
        for (int number = 1; number <= digit; number++) {

            factorial *= number;

        }
    
        System.out.println(factorial);

    }
    
}
