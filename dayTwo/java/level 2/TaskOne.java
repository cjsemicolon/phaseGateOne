import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int number = userInput.nextInt();

        if(number % 2 == 0) {
        
            System.out.print("even");

        }else{

            System.out.print("odd");        
    
        }  

    }

}
