import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print( "Enter age: ");
        int userAge = userInput.nextInt();

        if(userAge > 0 && userAge <= 12) {

            System.out.print("Child");
        
        }else if(userAge >= 13 && userAge < 20){

            System.out.print("Teen");

        }else if (userAge > 19) {

            System.out.print("Adult");

        }      
    
    }

}
