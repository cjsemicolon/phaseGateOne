import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int number = userInput.nextInt();

        if(number < 0) {
        
            System.out.print("Negative");

        }else{

            System.out.print("Positive");        
    
        }  

    }

}
