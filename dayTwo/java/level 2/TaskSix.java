import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first year: ");
        
        int year = userInput.nextInt();

        if((year % 4 == 0 || year % 100 != 0) || (year % 400 == 0)) {

            System.out.print("leap year")
        
        }else {

            System.out.print("not a leap year")    
        
        }

    }

}
