import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

          System.out.print("Enter a number: ");
              int digit = userInput.nextInt();            

       
        for (int number = 1; number <= digit; number++) {

          for(int count = 1; count <= number; count++) {

            System.out.print("*");

            }
          
             System.out.println();
        }
    
      

    }
    
}
