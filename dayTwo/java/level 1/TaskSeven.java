import java.util.Scanner;
public class TaskSeven {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        double radius = userInput.nextInt();

        double circumference = 2 * 3.142 * radius;

        System.out.print(circumference);

    }

}
