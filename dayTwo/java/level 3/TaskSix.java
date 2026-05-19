import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
            
        int sum = 0;
        for (int number = 1; number <= 5; number++) {

            System.out.print("Enter a number: ");
              int digit = userInput.nextInt();            

            sum += digit;

        }
    
        System.out.println(sum);

    }
    
}
