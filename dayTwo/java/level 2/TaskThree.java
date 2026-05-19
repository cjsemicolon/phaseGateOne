import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int studentScore = userInput.nextInt();

        if(studentScore >= 50) {
        
            System.out.print("Pass");

        }else{

            System.out.print("Fail");        
    
        }  

    }

}
