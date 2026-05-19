import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number");
        int digit = userInput.nextInt();
            

        for (int number = 1; number <= 12; number++) {

            System.out.println(digit + "x" + number + "=" + digit * number);

        }

    }
    
}
