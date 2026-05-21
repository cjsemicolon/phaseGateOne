//write a function that takes in an array and an integer and outputs an array of numbers that when added up would produce the integer collected with the array.
//input{8,6,12,4,-2}, 6 and {1,2,5,7,6,8,9}, 12
//
//write a function to collect the numbers
//write 2 loops(loop 1 to pick a number and loop 2 to pick the number after it.)
//return the new array

import java.util.Arrays;
public class additionToNumber {

    public  static int[] collectInput(int[] numbers, int integer){

        int count = 0;  

        int[] result = {};      

        for(int index = 0; index < numbers.length; index++) {

            for(int digit = index; digit < numbers.length; digit++) {

                if(numbers[index] + numbers[digit] == integer) {

                    result = new int [] {numbers[index], numbers[digit]};
                    
                     
        
                }

            }

            

        }  

         return result;      

    }
//write a function that finds the smallest and largest numbers in an array and prints the numbers in-between them
//write 2 loops to go through the array and compare numbers
//declear largest number as index 0
//if index > index 0
//largest = index
//do the opposite for smallest number
//store results in a new array
//loop through new array from index 0 to index 1 and print index 0++

    public static int[] printNumbersInBetween(int[] numbers){

        int[] numbersBetween = {};

        int largest = numbers[0];

        int smallest = numbers[0];

         for(int index = 0; index < numbers.length; index++) {

            for(int digit = index; digit < numbers.length; digit++) {         

                if (numbers[index] > largest) {

                    largest = numbers[index];

                }

            }
         
        }  

         
        
        
         for(int index = 0; index < numbers.length; index++) {

            for(int digit = index; digit < numbers.length; digit++) {

                if (numbers[index] < smallest) {

                    smallest = numbers[index];
                
                }
        
            }

        }

        for(int index = smallest; index <= largest; index++){
        
            numbersBetween = new int [] {index}; 

            System.out.print(Arrays.toString(numbersBetween));   
        
        }

       return numbersBetween;     

    }

    public static void main(String[] args) {

        int[] array = {8,6,12,4,-2};
        int number = 6;

         int[] input = {14, 9, 6, 5, 8, 10};
        
        System.out.print(Arrays.toString(collectInput(array, number)));

        System.out.print(Arrays.toString(printNumbersInBetween(input)));

        
    }

}
