import java.util.Scanner;
public class TaskOne {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("What is your name: ");
        String userName = userInput.nextLine();

        System.out.print("Welcome " + userName);

    }

}
