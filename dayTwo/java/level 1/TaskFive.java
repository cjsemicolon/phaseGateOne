import java.util.Scanner;
public class TaskFive {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the Temperature in celsius: ");
        int temperatureInCelsius = userInput.nextInt();

        double temperatureInFahrenheit = (temperatureInCelsius * 1.8) + 32;

        System.out.print(temperatureInFahrenheit+"F");

    }

}
