import java.util.Scanner;
public class TaskNine {

    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a price: ");
        int price = userInput.nextInt();

        double tax = price * 0.10;

        double priceWithTax = tax + price;

        System.out.print(priceWithTax);

    }

}
