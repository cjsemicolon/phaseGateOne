import java.util.Scanner;
public class TaskTwo {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("How old are you?: ");
        int userAge = userInput.nextInt();

        int futureAge = userAge + 5;

        System.out.print("In five years, you will be " + futureAge);

    }

}
