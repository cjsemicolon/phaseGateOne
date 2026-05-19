import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number between 1-7: ");
        int day = userInput.nextInt();

        if (day == 1) {
            
            System.out.print("Sunday");

        }

        if (day == 2) {
            
            System.out.print("Monday");

        }

        if (day == 3) {
            
            System.out.print("Tuesday");

        }

        if (day == 4) {
            
            System.out.print("Wednesday");

        }

        if (day == 5) {
            
            System.out.print("Thursday");

        }

        if (day == 6) {
            
            System.out.print("Friday");

        }

        if (day == 7) {
            
            System.out.print("Saturday");

        }else {

            System.out.print("Invalid number");        

        }

    }

}
