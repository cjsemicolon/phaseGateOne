import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
            
        int sum = 0;
        while (true) {

            System.out.print("Enter a number: ");
              int digit = userInput.nextInt();            

            sum += digit;

            if(digit == 0){
                break;
            }

        }
    
        System.out.println(sum);

    }
    
}
