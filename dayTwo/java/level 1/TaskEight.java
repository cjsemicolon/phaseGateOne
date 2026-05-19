import java.util.Scanner;
public class TaskEight {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        int numberSquare = number * number;

        System.out.print(numberSquare);

    }

}
