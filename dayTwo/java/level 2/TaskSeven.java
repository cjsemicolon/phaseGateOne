import java.util.Scanner;

public class TaskSeven {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String savedPassword = "admin123";

        System.out.print( "Enter a password: ");
        String password = userInput.nextLine();

        if(savedPassword .equals(password)) {

            System.out.print("Logged in");
        
        }else {

            System.out.print("Invalid password");

        }      
    
    }

}
