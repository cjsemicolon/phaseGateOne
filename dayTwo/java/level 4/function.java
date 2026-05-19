public class function {

    public static int addNumbers(int numberOne, int numberTwo){

        int sum = numberOne + numberTwo;

        return sum;

    }

    public static void main(String[] args){
    
        int numberOne = 5;
        int numberTwo = 5;
        int sum = addNumbers(numberOne, numberTwo);

        System.out.println(sum);


        int number = 5;
        
        System.out.println(evenNumberCheck(number));

        System.out.println(squareOfANumber(4));

        System.out.println(temperatureConverter(40));

        System.out.print(primeNumberChecker(7));

        System.out.println(largestOfThreeNumbers(4,7,5));

        System.out.println(simpleInterestCalculator(1000, 5, 6));

        System.out.println(areaOfrectangleCalculator(2, 5));


        
    
    }

    public static String evenNumberCheck(int number) {

        if(number % 2 == 0){

            return "even";    
    
        }

        else{

            return "odd";
    
        }
    
    }


    public static int squareOfANumber(int number) {

        int numberSquare = number * number;

        return numberSquare;

    } 

    public static double temperatureConverter(double temperature) {
        
       double convertedTemperature = (temperature * 1.8) + 32;

        return convertedTemperature;

    }

    public static boolean primeNumberChecker(int digit) {
        
        boolean isPrime = true;        
        
        for(int number = 2; number <= Math.sqrt(digit); number++) {
        
            if(digit % number == 0) {
    
                isPrime = true;

            }

            else{

               isPrime = false;
        
            }

        }

        return isPrime;


    }

    public static int largestOfThreeNumbers(int numberOne, int numberTwo, int numberThree) {

        int largest = numberOne;
            if(numberTwo > largest) {
        
                largest = numberTwo;

            }
        
            if(numberThree > largest) {

                largest = numberThree;

            }
    
            return largest;
    }

    public static double simpleInterestCalculator(double principal, double rate, double time) {

        double interest = (principal * rate * time)/100;

        return interest;

    }

    public static int areaOfrectangleCalculator(int length, int width) {

        int area = length * width;

        return area;

    }

    public static int numberReversal(int number) {
        
        int digit = 0;
        int reversed = 0;
        while (int number > 0) {

            number % 10;
            reversed = digit * 10 + reversed;
            number // 10;           

        }

        return reversed;
    }

   



}
